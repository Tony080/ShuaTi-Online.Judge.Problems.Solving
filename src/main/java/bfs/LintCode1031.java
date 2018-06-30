package bfs;

import java.util.LinkedList;
import java.util.Queue;

//Link: https://www.lintcode.com/problem/is-graph-bipartite/description
//Title: Is Graph Bipartite?
//Difficulty: Medium
public class LintCode1031 {
  /**
   * @param graph: the given undirected graph
   * @return:  return true if and only if it is bipartite
   */
  public boolean isBipartite(int[][] graph) {
    int[] color = new int[graph.length];

    for (int i = 0; i < graph.length; i++) {
      if (color[i] != 0) {
        continue;
      }
      if (!bfsLevelTraversal(graph, color, i)) {
        return false;
      }
    }
    return true;
  }

  private boolean bfsLevelTraversal(int[][] graph, int[] color, int startNode) {
    Queue<Integer> queue = new LinkedList<>();
    queue.offer(startNode);
    color[startNode] = 1;

    while(!queue.isEmpty()) {
      int size = queue.size();
      for (int j = 0; j < size; j ++) {
        int current = queue.poll();
        int currentColor = color[current];
        for (int k = 0; k < graph[current].length; k++) {
          if (color[graph[current][k]] == currentColor) {
            return false;
          }
          if (color[graph[current][k]] != 0) {
            continue;
          }
          color[graph[current][k]] = currentColor == 1 ? 2 : 1;
          queue.offer(graph[current][k]);
        }
      }
    }
    return true;
  }
}
