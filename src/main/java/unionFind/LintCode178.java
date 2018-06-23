package unionFind;

//Link: https://www.lintcode.com/problem/graph-valid-tree/description
//Title: Graph Valid Tree
//Difficulty: Medium
public class LintCode178 {
  private int[] father;

  public boolean validTree(int n, int[][] edges) {
    father = new int[n];
    for (int i = 1; i < n; i++) {
      father[i] = i;
    }

    for (int[] edge : edges) {
      if (connect(edge[0], edge[1])) {
        return false;
      }
    }

    int count = 0;
    for (int i = 0; i < n; i++) {
      if (father[i] == i) {
        count++;
      }
    }
    return count == 1;
  }

  private int find(int x) {
    if (father[x] == x) {
      return x;
    }
    return father[x] = find(father[x]);
  }

  private boolean connect(int a, int b) {
    int rootA = find(a);
    int rootB = find(b);
    if (rootA == rootB) {
      return true;
    } else {
      father[rootA] = rootB;
      return false;
    }
  }
}
