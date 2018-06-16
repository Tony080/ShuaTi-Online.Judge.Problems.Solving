package bfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;


//Link: https://www.lintcode.com/problem/connected-component-in-undirected-graph/description
//Title: Connected Component in Undirected Graph
//Difficulty: Medium
public class LintCode431 {

  static class UndirectedGraphNode {
      int label;
      ArrayList<UndirectedGraphNode> neighbors;
      UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<>(); }
  }
  /*
   * @param nodes: a array of Undirected graph node
   * @return: a connected set of a Undirected graph
   */
  public List<List<Integer>> connectedSet(List<UndirectedGraphNode> nodes) {
    // write your code here
    List<List<Integer>> result = new ArrayList<>();
    Set<Integer> set = new HashSet<>();

    for (UndirectedGraphNode node : nodes) {
      if (set.contains(node.label)) {
        continue;
      }
      result.add(bfs(node, set));
    }
    return result;
  }

  private List<Integer> bfs(UndirectedGraphNode node, Set<Integer> set) {
    Queue<UndirectedGraphNode> queue = new LinkedList<>();
    List<Integer> graph = new ArrayList<>();

    set.add(node.label);
    queue.offer(node);

    while (!queue.isEmpty()) {
      UndirectedGraphNode current = queue.poll();
      graph.add(current.label);
      for (UndirectedGraphNode neighbor : current.neighbors) {
        if (set.contains(neighbor.label)) {
          continue;
        }
        set.add(neighbor.label);
        queue.offer(neighbor);
      }
    }
    Collections.sort(graph);
    return graph;
  }
}
