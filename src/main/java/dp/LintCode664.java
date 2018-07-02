package dp;

//Link: https://www.lintcode.com/problem/counting-bits/description
//Title: Counting Bits
//Difficulty: Medium
public class LintCode664 {
  public int[] countBits(int num) {
    int[] result = new int[num + 1];
    for (int i = 0; i <= num; i++) {
      result[i] = result[i >>> 1] + (i & 1);
    }
    return result;
  }
}
