package string;

//Link: https://www.lintcode.com/problem/count-and-say/description
//Title: Count and Say
//Difficulty: Easy
public class LintCode420 {
  public String countAndSay(int n) {
    String start = "1";
    for (int i = 1; i < n; i ++) {
      start = count(start);
    }
    return start;
  }

  private String count(String str) {
    StringBuilder sb = new StringBuilder();
    int count = 1;
    char current = str.charAt(0);
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == current) {
        count++;
      } else {
        sb.append(count).append(current);
        count = 1;
        current = str.charAt(i);
      }
    }
    sb.append(count).append(current);

    return sb.toString();
  }
}
