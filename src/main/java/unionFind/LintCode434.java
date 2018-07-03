package unionFind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Link: https://www.lintcode.com/problem/number-of-islands-ii/description
//Title: Number of Islands II
//Difficulty: Hard
public class LintCode434 {
  static class Point {
    int x;
    int y;

    Point() {
      x = 0;
      y = 0;
    }

    Point(int a, int b) {
      x = a;
      y = b;
    }
  }

  private int[] father;

  public List<Integer> numIslands2(int n, int m, Point[] operators) {
    List<Integer> result = new ArrayList<>();
    if (operators == null) {
      return result;
    }

    int[] xBias = new int[]{0, 0, -1, 1};
    int[] yBias = new int[]{-1, 1, 0, 0};
    father = new int[n * m];
    Arrays.fill(father, -1);
    int count = 0;

    for (Point operator : operators) {
      int oneDPoint = convert2dTo1d(operator.x, operator.y, m);
      if (father[oneDPoint] != oneDPoint) {
        count++;
        father[oneDPoint] = oneDPoint;
        for (int i = 0; i < xBias.length; i++) {
          int newX = operator.x + xBias[i];
          int newY = operator.y + yBias[i];
          if (!isValid(n, m, newX, newY)) {
            continue;
          }
          int newOneDPoint = convert2dTo1d(newX, newY, m);
          if (father[newOneDPoint] != -1) {
            int rootA = find(oneDPoint);
            int rootB = find(newOneDPoint);
            if (rootA != rootB) {
              count--;
              father[rootA] = rootB;
            }
          }
        }
      }
      result.add(count);
    }
    return result;
  }

  private boolean isValid(int n, int m, int newX, int newY) {
    return newX >= 0 && newY >= 0 && newX < n && newY < m;
  }

  private int convert2dTo1d(int x, int y, int m) {
    return x * m + y;
  }

  private int find(int x) {
    if (father[x] == x) {
      return x;
    }
    return father[x] = find(father[x]);
  }
}
