package string;

//Link: https://www.lintcode.com/problem/delete-characters/description
//Title: Delete Characters
//Difficulty: Easy
public class LintCode1445 {
  /**
   * @param s: The string s
   * @param t: The string t
   * @return: Return if can get the string t
   */
  public boolean canGetString(String s, String t) {
    int tLength = t.length();
    int sLength = s.length();

    int j = 0;
    for (int i = 0; i < sLength; i++) {
      if (s.charAt(i) == t.charAt(j)) {
        j++;
      }
      if (j == tLength) {
        return true;
      }
    }
    return j == tLength;
  }
}
