package string;

//Link: https://www.lintcode.com/problem/reverse-words-in-a-string-iii/description
//Title: Reverse Words in a String III
//Difficulty: Easy
public class LintCode1173 {
  public String reverseWords(String s) {
    StringBuilder result = new StringBuilder();
    StringBuilder sb = new StringBuilder();

    for (char c : s.toCharArray()) {
      if (c != ' ') {
        sb.insert(0, c);
      } else {
        result.append(sb.toString());
        result.append(c);
        sb.setLength(0);
      }
    }
    if (sb.length() != 0) {
      result.append(sb.toString());
    }
    return result.toString();
  }
}
