package unionFind;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Link: https://www.lintcode.com/problem/find-the-weak-connected-component-in-the-directed-graph/description
//Title: Find the Weak Connected Component in the Directed Graph
//Difficulty: Medium
public class LintCode432 {

  public static class DirectedGraphNode {
    int label;
    ArrayList<DirectedGraphNode> neighbors;
    DirectedGraphNode(int x) {
      label = x;
      neighbors = new ArrayList<>();
    }
  }

  private Map<Integer, Integer> father;
  /*
   * @param nodes: a array of Directed graph node
   * @return: a connected set of a directed graph
   */
  public List<List<Integer>> connectedSet2(ArrayList<DirectedGraphNode> nodes) {
    initializeFatherMap(nodes);

    for (DirectedGraphNode node : nodes) {
      int current = node.label;
      for (DirectedGraphNode neighbor : node.neighbors) {
        connect(current, neighbor.label);
      }
    }
    return convertMapToList();
  }

  private List<List<Integer>> convertMapToList() {
    List<List<Integer>> result = new ArrayList<>();
    for (Map.Entry<Integer, Integer> entry : father.entrySet()) {
      if (entry.getKey() != entry.getValue()) {
        continue;
      }
      int currentFather = entry.getKey();
      List<Integer> subGraph = new ArrayList<>();
      for (Map.Entry<Integer, Integer> innerEntry : father.entrySet()) {
        if (find(innerEntry.getKey()) == currentFather) {
          subGraph.add(innerEntry.getKey());
        }
      }
      Collections.sort(subGraph);
      result.add(subGraph);
    }
    return result;
  }

  private void initializeFatherMap(ArrayList<DirectedGraphNode> nodes) {
    father = new HashMap<>();
    Set<Integer> set = new HashSet<>();

    for (DirectedGraphNode node : nodes) {
      set.add(node.label);
      for (DirectedGraphNode neighbor : node.neighbors) {
        set.add(neighbor.label);
      }
    }

    for (Integer element : set) {
      father.put(element, element);
    }
  }

  private int find(int x) {
    int parent = father.get(x);
    while (parent != father.get(parent)) {
      parent = father.get(parent);
    }

    int oldParent = father.get(x);
    while (oldParent != father.get(oldParent)) {
      int temp = father.get(oldParent);
      father.put(oldParent, parent);
      oldParent = temp;
    }

    return parent;
  }

  private void connect(int a, int b) {
    int rootA = find(a);
    int rootB = find(b);
    if (rootA != rootB) {
      father.put(rootA, rootB);
    }
  }
}
