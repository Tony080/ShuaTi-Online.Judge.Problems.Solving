package bfs;

import java.util.LinkedList;
import java.util.Queue;

//Link: https://www.lintcode.com/problem/01-matrix-walking-problem/description
//Title: 01 Matrix Walking Problem
//Difficulty: Medium
public class LintCode1446 {
  public static class Element {
    public int x;
    public int y;
    public boolean hasChangeTheWall;
    public Element(int x, int y, boolean hasChangeTheWall) {
      this.x = x;
      this.y = y;
      this.hasChangeTheWall = hasChangeTheWall;
    }
  }

  public int getBestRoad(int[][] grid) {
    int[] xBias = new int[]{0, 0, -1, 1};
    int[] yBias = new int[]{-1, 1, 0, 0};

    int steps = 0;
    Queue<Element> queue = new LinkedList<>();
    //Set are used for 2 purpose:
    //1. mark visited in [x][y][0];
    //2. mark if the previous visit has already change the wall in [x][y][1].
    boolean[][][] set = new boolean[grid.length][grid[0].length][2];

    queue.offer(new Element(0, 0, grid[0][0] == 1));
    set[0][0][0] = true;

    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        Element current = queue.poll();
        if (reachEnd(current, grid)) {
          return steps;
        }
        for (int j = 0; j < xBias.length; j++) {
          int newX = current.x + xBias[j];
          int newY = current.y + yBias[j];
          if(!isValid(current.hasChangeTheWall, newX, newY, grid, set)) {
            continue;
          }
          set[newX][newY][0] = true;
          set[newX][newY][1] = grid[newX][newY] != 1 && current.hasChangeTheWall;
          queue.offer(new Element(newX, newY, grid[newX][newY] == 1 || current.hasChangeTheWall));
        }
      }
      steps++;
    }

    return -1;
  }

  private boolean reachEnd(Element element, int[][] grid) {
    return element.x == (grid.length - 1) && element.y == (grid[0].length - 1);
  }

  private boolean isValid(boolean hasChangeTheWall, int newX, int newY, int[][] grid, boolean[][][] set) {
    return newX >= 0 && newY >= 0 && newX < grid.length && newY < grid[0].length && !visited(hasChangeTheWall, set, newX, newY) && !(hasChangeTheWall && grid[newX][newY] == 1);
  }

  private boolean visited(boolean hasChangeTheWall, boolean[][][] set, int newX, int newY) {
    return set[newX][newY][0] && (!set[newX][newY][1] || hasChangeTheWall);
  }
}
