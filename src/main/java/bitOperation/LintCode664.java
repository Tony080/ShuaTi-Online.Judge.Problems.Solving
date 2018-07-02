package bitOperation;

//Link: https://www.lintcode.com/problem/counting-bits/description
//Title: Counting Bits
//Difficulty: Medium
public class LintCode664 {
  public int[] countBits(int num) {
    int[] result = new int[num + 1];
    for (int i = 0; i <= num; i++) {
      int count = 0;
      int n = i;
      while (n != 0) {
        n &= (n - 1);
        count++;
      }
      result[i] = count;
    }
    return result;
  }
}
