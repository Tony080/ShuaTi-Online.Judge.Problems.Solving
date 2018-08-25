package mathematics;

//Link: https://www.lintcode.com/problem/trailing-zeros/description
//Title: Trailing Zeros
//Difficulty: Easy
public class LintCode2 {
  public long trailingZeros(long n) {
    // write your code here, try to do it without arithmetic operators.
    long count = 0;
    while (n != 0) {
      n /= 5;
      count += n;
    }
    return count;
  }
}
