package bfs;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LintCode431Test {

  @Test
  public void connectedSet() {
    List<LintCode431.UndirectedGraphNode> test1 = generateTestData();
    LintCode431 lintCode431 = new LintCode431();
    List<List<Integer>> result = lintCode431.connectedSet(test1);

    int[][] expected = new int[][]{{1, 2, 3}, {4}, {5}, {6}};
    for (int i = 0; i < result.size(); i++) {
      List<Integer> graph = result.get(i);
      for (int j = 0; j < graph.size(); j++) {
        assertEquals(expected[i][j], (int)graph.get(j));
      }
    }

  }

  private List<LintCode431.UndirectedGraphNode> generateTestData() {
    LintCode431.UndirectedGraphNode node1 = new LintCode431.UndirectedGraphNode(1);
    LintCode431.UndirectedGraphNode node2 = new LintCode431.UndirectedGraphNode(2);
    LintCode431.UndirectedGraphNode node3 = new LintCode431.UndirectedGraphNode(3);
    LintCode431.UndirectedGraphNode node4 = new LintCode431.UndirectedGraphNode(4);
    LintCode431.UndirectedGraphNode node5 = new LintCode431.UndirectedGraphNode(5);
    LintCode431.UndirectedGraphNode node6 = new LintCode431.UndirectedGraphNode(6);

    node1.neighbors.add(node2);
    node1.neighbors.add(node3);
    node2.neighbors.add(node1);
    node2.neighbors.add(node3);
    node3.neighbors.add(node1);
    node3.neighbors.add(node2);

    List<LintCode431.UndirectedGraphNode> test1 = new ArrayList<>();
    test1.add(node1);
    test1.add(node2);
    test1.add(node3);
    test1.add(node4);
    test1.add(node5);
    test1.add(node6);

    return test1;
  }
}