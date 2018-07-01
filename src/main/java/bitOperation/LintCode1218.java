package bitOperation;

//Link: https://www.lintcode.com/problem/number-complement/description
//Title: Number Complement
//Difficulty: Easy
public class LintCode1218 {
  public int findComplement(int num) {
    int bits = num;
    bits |= (bits >> 1);
    bits |= (bits >> 2);
    bits |= (bits >> 4);
    bits |= (bits >> 8);
    bits |= (bits >> 16);
    bits = bits - (bits >>> 1);

    return num ^ ((bits << 1) - 1);
  }
}
