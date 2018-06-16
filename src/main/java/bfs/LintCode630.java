package bfs;

import java.util.LinkedList;
import java.util.Queue;


//Link: https://www.lintcode.com/problem/knight-shortest-path-ii/description
//Title: Knight Shortest Path II
//Difficulty: Medium
public class LintCode630 {


  class Coordinate {
    int x;
    int y;

    Coordinate(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  /**
   * @param grid: a chessboard included 0 and 1
   * @return: the shortest path
   */
  public int shortestPath2(boolean[][] grid) {
    int[] yBias = {2, 2, 1, 1};
    int[] xBias = {1, -1, 2, -2};
    Queue<Coordinate> queue = new LinkedList<>();
    queue.offer(new Coordinate(0, 0));
    int level = 0;

    while (!queue.isEmpty()) {
      int size = queue.size();
      level++;

      for (int i = 0; i < size; i++) {
        Coordinate current = queue.poll();
        for (int j = 0; j < xBias.length; j++) {
          int x = current.x + xBias[j];
          int y = current.y + yBias[j];
          if (reachEnd(grid, x, y)) {
            return level;
          }
          if (isValid(grid, x, y)) {
            queue.offer(new Coordinate(x, y));
            grid[x][y] = true;
          }
        }
      }
    }
    return -1;
  }

  private boolean reachEnd(boolean[][] grid, int x, int y) {
    return (x == grid.length - 1) && (y == grid[0].length - 1) && !grid[x][y];
  }
  private boolean isValid(boolean[][] grid, int x, int y) {
    return x >= 0 && x < grid.length && y < grid[0].length && !grid[x][y];
  }
}