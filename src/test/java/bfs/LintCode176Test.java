package bfs;

import org.junit.Test;

import java.util.ArrayList;
import bfs.LintCode176.DirectedGraphNode;

import static org.junit.Assert.*;

public class LintCode176Test {

  @Test
  public void hasRoute() {
    ArrayList<DirectedGraphNode> test1 = new ArrayList<>();
    DirectedGraphNode node1 = new DirectedGraphNode(1);
    DirectedGraphNode node2 = new DirectedGraphNode(2);
    DirectedGraphNode node3 = new DirectedGraphNode(3);
    DirectedGraphNode node4 = new DirectedGraphNode(4);
    DirectedGraphNode node5 = new DirectedGraphNode(5);

    node1.neighbors.add(node2);
    node1.neighbors.add(node4);

    node2.neighbors.add(node3);
    node2.neighbors.add(node4);

    node4.neighbors.add(node5);

    test1.add(node1);
    test1.add(node2);
    test1.add(node3);
    test1.add(node4);
    test1.add(node5);

    LintCode176 lintCode176 = new LintCode176();
    assertTrue(lintCode176.hasRoute(test1, node2, node5));
    assertFalse(lintCode176.hasRoute(test1, node4, node3));
    assertTrue(lintCode176.hasRoute(test1, node1, node5));
  }
}