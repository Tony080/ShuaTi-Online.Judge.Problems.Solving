package unionFind;

import java.util.Arrays;

//Link: https://www.lintcode.com/problem/set-union/description
//Title: Set Union
//Difficulty: Medium
public class LintCode1396 {
  private int[] visited;
  /**
   * @param sets: Initial set list
   * @return: The final number of sets
   */
  public int setUnion(int[][] sets) {
    int[] father = new int[100001];
    Arrays.fill(father, -1);
    int result = 0;

    visited = new int[sets.length];
    for (int i = 1; i < sets.length; i++) {
      visited[i] = i;
    }

    for (int i = 0; i < sets.length; i++) {
      for (int set : sets[i]) {
        if (father[set] == -1) {
          father[set] = find(i);
        } else {
          connect(i, father[set]);
          father[set] = find(i);
        }
      }
    }
    for (int i = 0; i < sets.length; i++) {
      if (visited[i] == i) {
        result++;
      }
    }
    return result;
  }

  private void connect(int a, int b) {
    int rootA = find(a);
    int rootB = find(b);
    if (rootA != rootB) {
      visited[rootA] = rootB;
    }
  }

  private int find(int x) {
    if (visited[x] == x) {
      return x;
    }
    return visited[x] = find(visited[x]);
  }
}
