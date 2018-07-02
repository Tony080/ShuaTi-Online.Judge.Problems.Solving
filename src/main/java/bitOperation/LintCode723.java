package bitOperation;

//Link: https://www.lintcode.com/problem/rotate-bits-left/description
//Title: Rotate Bits - Left
//Difficulty: Medium
public class LintCode723 {
  public int leftRotate(int n, int d) {
    return  (n << d) | (n >>> (32 - d));
  }
}
