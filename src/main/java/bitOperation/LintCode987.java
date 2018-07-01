package bitOperation;

//Link: https://www.lintcode.com/problem/binary-number-with-alternating-bits/description
//Title: Binary Number with Alternating Bits
//Difficulty: Easy
public class LintCode987 {
  public boolean hasAlternatingBits(int n) {
    return (n & 0xAAAAAAAA) == 0 || (n & 0x55555555) == 0;
  }
}
