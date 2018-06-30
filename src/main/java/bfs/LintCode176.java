package bfs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

//Link: https://www.lintcode.com/problem/route-between-two-nodes-in-graph/description
//Title: Route Between Two Nodes in Graph
//Difficulty: Medium
public class LintCode176 {
  public static class DirectedGraphNode {
    int label;
    ArrayList<DirectedGraphNode> neighbors;
    DirectedGraphNode(int x) {
      label = x;
      neighbors = new ArrayList<>();
    }
  }

  public boolean hasRoute(ArrayList<DirectedGraphNode> graph, DirectedGraphNode s, DirectedGraphNode t) {
    Set<Integer> set = new HashSet<>();
    Queue<DirectedGraphNode> queue = new LinkedList<>();
    queue.offer(s);
    set.add(s.label);
    while (!queue.isEmpty()) {
      DirectedGraphNode current = queue.poll();
      if (current.label == t.label) {
        return true;
      }
      for (DirectedGraphNode neighbor : current.neighbors) {
        if (set.contains(neighbor.label)) {
          continue;
        }
        set.add(neighbor.label);
        queue.offer(neighbor);
      }
    }
    return false;
  }
}
