package bitOperation;

//Link: https://www.lintcode.com/problem/number-of-1-bits/description
//Title: Number of 1 Bits
//Difficulty: Easy
public class LintCode1332 {
  public int hammingWeight(int n) {
    // write your code here
    int result = 0;
    while (n != 0) {
      n = n & (n - 1);
      result++;
    }
    return result;
  }
}
