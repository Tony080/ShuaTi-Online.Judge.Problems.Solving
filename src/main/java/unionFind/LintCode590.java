package unionFind;

public class LintCode590 {
  private int[] father;
  private int[] count;

  /*
   * @param n: An integer
   */
  public LintCode590(int n) {
    father = new int[n + 1];
    count = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      father[i] = i;
      count[i] = 1;
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
      count[rootB] += count[rootA];
    }
  }

  public int query(int a) {
    int x = find(a);
    return count[x];
  }
}
