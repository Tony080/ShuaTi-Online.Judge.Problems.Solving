package bitOperation;

//Link: https://www.lintcode.com/problem/flip-bits/description
//Title: Flip Bits
//Difficulty: Easy
public class LintCode181 {
  public int bitSwapRequired(int a, int b) {
    int c = a ^ b;
    int result = 0;
    while (c != 0) {
      c = c & (c - 1);
      result++;
    }
    return result;
  }
}
