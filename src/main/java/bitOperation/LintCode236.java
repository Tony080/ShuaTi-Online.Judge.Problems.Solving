package bitOperation;

//Link: https://www.lintcode.com/problem/swap-bits/description
//Title: Swap Bits
//Difficulty: Easy
public class LintCode236 {
  public int swapOddEvenBits(int x) {
    int evenBits = x & 0x55555555;
    int oddBits = x & 0xaaaaaaaa;
    return (oddBits >>> 1) | (evenBits << 1);
  }
}
