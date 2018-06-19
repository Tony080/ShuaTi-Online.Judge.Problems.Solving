package unionFind;


//Link: https://www.lintcode.com/problem/connecting-graph/description
//Title: Connecting Graph
//Difficulty: Medium
public class LintCode589 {
  private int[] father;

  /*
   * @param n: An integer
   */public LintCode589(int n) {
    father = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      father[i] = i;
    }
  }

  /*
   * @param a: An integer
   * @param b: An integer
   * @return: nothing
   */
  public void connect(int a, int b) {
    // write your code here
    int rootA = find(a);
    int rootB = find(b);
    if (rootA != rootB) {
      father[rootA] = rootB;
    }
  }

  /*
   * @param a: An integer
   * @param b: An integer
   * @return: A boolean
   */
  public boolean query(int a, int b) {
    return find(a) == find(b);
  }

  private int find(int x) {
    if (father[x] == x) {
      return x;
    }
    return father[x] = find(father[x]);
  }
}
