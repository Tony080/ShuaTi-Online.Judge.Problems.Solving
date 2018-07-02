package bitOperation;

//Link: https://www.lintcode.com/problem/update-bits/description
//Title: Update Bits
//Difficulty: Medium
public class LintCode179 {
  public int updateBits(int n, int m, int i, int j) {
    long higherBitsMask = ~((1L << (j + 1)) - 1);
    long lowerBitsMask = (1L << i) - 1;
    long clearMask = higherBitsMask | lowerBitsMask;
    return (int)((clearMask & n) | (m << i));
  }
}
