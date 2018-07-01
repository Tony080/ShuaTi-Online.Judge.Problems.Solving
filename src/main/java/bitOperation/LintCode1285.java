package bitOperation;

//Link: https://www.lintcode.com/problem/power-of-four/description
//Title: Power of Four
//Difficulty: Easy
public class LintCode1285 {
  public boolean isPowerOfFour(int num) {
    return num >= 0 && ((num & (num - 1)) == 0) && ((num & 0x55555555) != 0);
  }
}
