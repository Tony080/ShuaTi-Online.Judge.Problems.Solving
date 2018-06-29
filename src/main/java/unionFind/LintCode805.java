package unionFind;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Link: https://www.lintcode.com/problem/maximum-association-set/description
//Title: Maximum Association Set
//Difficulty: Medium
public class LintCode805 {
  private Map<String, String> father;

  /**
   * @param ListA: The relation between ListB's books
   * @param ListB: The relation between ListA's books
   * @return: The answer
   */
  public List<String> maximumAssociationSet(String[] ListA, String[] ListB) {
    initializeUnionFind(ListA, ListB);

    for (int i = 0; i < ListA.length; i++) {
      connect(ListA[i], ListB[i]);
    }

    return getMaxAssociationSet();
  }

  private void initializeUnionFind(String[] ListA, String[] ListB) {
    Set<String> set = new HashSet<>();
    for (int i = 0; i < ListA.length; i++) {
      set.add(ListA[i]);
      set.add(ListB[i]);
    }

    father = new HashMap<>();
    for (String element : set) {
      father.put(element, element);
    }
  }

  private void connect(String a, String b) {
    String rootA = find(a);
    String rootB = find(b);
    if (!rootA.equals(rootB)) {
      father.put(rootA, rootB);
    }
  }

  private String find(String x) {
    String parent = x;
    while (!father.get(parent).equals(parent)) {
      parent = father.get(parent);
    }

    String temp = x;
    while (!father.get(x).equals(x)) {
      temp = father.get(x);
      father.put(x, parent);
      x = temp;
    }
    return parent;
  }

  private List<String> getMaxAssociationSet() {
    Set<String> set = new HashSet<>();
    for (Map.Entry<String, String> entry : father.entrySet()) {
      String node = entry.getKey();
      if (node.equals(father.get(node))) {
        set.add(node);
      }
    }

    Map<String, List<String>> map = new HashMap<>();
    for (String element : set) {
      map.put(element, new ArrayList<>());
    }
    for (Map.Entry<String, String> entry : father.entrySet()) {
      String node = entry.getKey();
      map.get(find(node)).add(node);
    }

    int max = 0;
    List<String> result = null;
    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
      List<String> currentList = entry.getValue();
      if (currentList.size() > max) {
        max = currentList.size();
        result = currentList;
      }
    }
    return result;
  }
}
