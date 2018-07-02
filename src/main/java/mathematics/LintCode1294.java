package mathematics;

//Link: https://www.lintcode.com/problem/power-of-three/description
//Title: Power of Three
//Difficulty: Easy
public class LintCode1294 {
  public boolean isPowerOfThree(int n) {
    int lastDigit = n % 10;
    return n > 0 && (n == 1 || n % 3 == 0) && (lastDigit == 1 || lastDigit == 3 || lastDigit == 7 || lastDigit == 9);
  }
}
