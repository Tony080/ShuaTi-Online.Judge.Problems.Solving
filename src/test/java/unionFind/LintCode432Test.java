package unionFind;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import unionFind.LintCode432.DirectedGraphNode;

import static org.junit.Assert.*;

public class LintCode432Test {

  @Test
  public void connectedSet2() {
    ArrayList<DirectedGraphNode> test1 = createTest1();
    LintCode432 lintCode432 = new LintCode432();

    List<List<Integer>> answer1 = createAnswer1();
    List<List<Integer>> result1 = lintCode432.connectedSet2(test1);

    for (int i = 0; i < answer1.size(); i++) {
      for (int j = 0; j < answer1.get(i).size(); j++) {
        assertEquals(answer1.get(i).get(j), result1.get(i).get(j));
      }
    }

  }

  public ArrayList<DirectedGraphNode>  createTest1() {
    ArrayList<DirectedGraphNode> test1 = new ArrayList<>();
    DirectedGraphNode node1 = new DirectedGraphNode(1);
    DirectedGraphNode node2 = new DirectedGraphNode(2);
    DirectedGraphNode node3 = new DirectedGraphNode(3);
    DirectedGraphNode node4 = new DirectedGraphNode(4);
    DirectedGraphNode node5 = new DirectedGraphNode(5);
    DirectedGraphNode node6 = new DirectedGraphNode(6);

    node1.neighbors.add(node2);
    node1.neighbors.add(node4);

    node2.neighbors.add(node4);

    node3.neighbors.add(node5);

    node6.neighbors.add(node5);

    test1.add(node1);
    test1.add(node2);
    test1.add(node3);
    test1.add(node4);
    test1.add(node5);
    test1.add(node6);

    return test1;
  }

  public List<List<Integer>> createAnswer1() {
    List<List<Integer>> result = new ArrayList<>();
    result.add(Arrays.asList(1, 2, 4));
    result.add(Arrays.asList(3, 5, 6));

    return result;
  }
}