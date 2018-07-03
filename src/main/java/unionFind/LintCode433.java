package unionFind;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//Link: https://www.lintcode.com/problem/number-of-islands/description
//Title: Number of Islands
//Difficulty: Easy
public class LintCode433 {
  private int[] father;

  public int numIslands(boolean[][] grid) {
    if (grid.length == 0) {
      return 0;
    }
    int[] xBias = new int[] {0, 0, -1, 1};
    int[] yBias = new int[] {-1, 1, 0, 0};
    father = new int[grid.length * grid[0].length];
    Arrays.fill(father, -1);

    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[]{0, 0});
    father[0] = grid[0][0] ? 0 : -2;

    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      for (int i = 0; i < xBias.length; i++) {
        int newX = current[0] + xBias[i];
        int newY = current[1] + yBias[i];
        if (!isValid(grid, newX, newY)) {
          continue;
        }
        int oneDPoint = convert2dTo1d(newX, newY, grid[0].length);
        if (father[oneDPoint] == -1) {
          father[oneDPoint] = -2;
          queue.offer(new int[] {newX, newY});
        }
        if (grid[newX][newY]) {
          if (father[oneDPoint] < 0) {
            father[oneDPoint] = oneDPoint;
          }
          if (grid[current[0]][current[1]]) {
            connect(convert2dTo1d(current[0], current[1], grid[0].length), oneDPoint);
          }
        }
      }
    }

    int result = 0;
    for (int i = 0; i < father.length; i++) {
      if (father[i] == i) {
        result++;
      }
    }
    return result;
  }

  private boolean isValid(boolean[][] grid, int newX, int newY) {
    return newX >= 0 && newY >= 0 && newX < grid.length && newY < grid[0].length;
  }

  private int convert2dTo1d(int x, int y, int colLength) {
    return x * colLength + y;
  }

  private void connect(int a, int b) {
    int rootA = find(a);
    int rootB = find(b);
    if (rootA != rootB) {
      father[rootA] = rootB;
    }
  }

  private int find(int x) {
    if (father[x] == x) {
      return x;
    }
    return father[x] = find(father[x]);
  }
}
