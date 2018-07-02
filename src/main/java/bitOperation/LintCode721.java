package bitOperation;

//Link: https://www.lintcode.com/problem/next-sparse-number/description
//Title: Next Sparse Number
//Difficulty: Hard
public class LintCode721 {
  public int nextSparseNum(int x) {
    while (!isSparseNumber(x)) {
      x++;
    }
    return x;
  }

  private boolean isSparseNumber(int x) {
    return (x & (x >>> 1)) == 0;
  }
}
