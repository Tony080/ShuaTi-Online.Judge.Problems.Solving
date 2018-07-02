package mathematics;

//Link: https://www.lintcode.com/problem/integer-replacement/description
//Title: Integer Replacement
//Difficulty: Medium
public class LintCode1259 {
  public int integerReplacement(int n) {
    int steps = 0;
    while (n != 1) {
      if ((n & 1) == 0) {
        n >>>= 1;
      } else {
        int t = (n - 1) >>> 1;
        if ((t & 1) == 0 || t == 1) {
          n--;
        } else {
          n++;
        }
      }
      steps++;
    }
    return steps;
  }
}
