package bitOperation;

//Link: https://www.lintcode.com/problem/hamming-distance/description
//Title: Hamming Distance
//Difficulty: Easy
public class LintCode835 {
  public int hammingDistance(int x, int y) {
    int xor = x ^ y;
    int count = 0;
    while (xor != 0) {
      xor &= (xor - 1);
      count++;
    }
    return count;
  }
}
