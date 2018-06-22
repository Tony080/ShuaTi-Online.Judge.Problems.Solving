package unionFind;

//Link: https://www.lintcode.com/problem/connecting-graph-iii/description
//Title: Connecting Graph III
//Difficulty: Medium
public class LintCode591 {
  private int[] father;
  private int count;

  public LintCode591(int n) {
    father = new int[n + 1];
    count = n;
    for (int i = 1; i <= n; i++) {
      father[i] = i;
    }
  }

  private int find(int x) {
    if (father[x] == x) {
      return x;
    }
    return father[x] = find(father[x]);
  }

  public void connect(int a, int b) {
    int rootA = find(a);
    int rootB = find(b);
    if (rootA != rootB) {
      father[rootA] = rootB;
      count--;
    }
  }

  public int query() {
    return count;
  }
}
