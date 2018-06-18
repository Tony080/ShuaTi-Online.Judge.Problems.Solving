package string;

//Link: https://www.lintcode.com/problem/reverse-words-in-a-string/description
//Title: Reverse Words in a String
//Difficulty: Easy
public class LintCode53 {
  /*
   * @param s: A string
   * @return: A string
   */
  public String reverseWords(String s) {
    int length = s.length();
    StringBuilder sb = new StringBuilder();
    StringBuilder result = new StringBuilder(length);

    for (int i = 0; i < length; i++) {
      char c = s.charAt(i);
      if (c == ' ' && sb.length() != 0) {
        result.insert(0, sb.toString());
        result.insert(0, ' ');
        sb.setLength(0);
      } else if (c != ' ') {
        sb.append(c);
      }
    }

    if (sb.length() != 0) {
      result.insert(0, sb.toString());
    } else if (result.length() != 0){
      result = result.deleteCharAt(0);
    }
    return result.toString();
  }
}
