package bitOperation;

//Link: https://www.lintcode.com/problem/utf-8-validation/description
//Title: UTF-8 Validation
//Difficulty: Medium
public class LintCode1262 {
  public boolean validUtf8(int[] data) {
    if (data == null || data.length == 0) {
      return false;
    }
    int count = 0;
    for (int d : data) {
      if (count == 0) {
        if ((d >>> 3) == 0b11110) {
          count = 3;
        } else if ((d >>> 4) == 0b1110) {
          count = 2;
        } else if ((d >>> 5) == 0b110) {
          count = 1;
        } else if ((d >>> 7) != 0) {
          return false;
        }
      } else {
        if ((d >>> 6) != 0b10) {
          return false;
        }
        count--;
      }
    }
    return count == 0;
  }
}
