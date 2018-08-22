package array;

//Link: https://www.lintcode.com/problem/rotate-string/description
//Title: Rotate String
//Difficulty: Easy
public class LintCode8 {
  public void rotateString(char[] str, int offset) {
    // write your code here
    if (str.length == 0) {
      return;
    }
    offset %= str.length;
    for (int i = 0; i < offset; i++) {
      rotateStringByOne(str);
    }
  }

  private void rotateStringByOne(char[] str) {
    char last = str[str.length - 1];
    for (int i = str.length - 1; i > 0; i--) {
      str[i] = str[i - 1];
    }
    str[0] = last;
  }
}
