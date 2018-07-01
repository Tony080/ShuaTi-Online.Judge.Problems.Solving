package bitOperation;

//Link: https://www.lintcode.com/problem/o1-check-power-of-2/description
//Title: O(1) Check Power of 2
//Difficulty: Easy
public class LintCode142 {
  public boolean checkPowerOf2(int n) {
    if (n <= 0) {
      return false;
    }
    return (n & (n - 1)) == 0;
  }
}
