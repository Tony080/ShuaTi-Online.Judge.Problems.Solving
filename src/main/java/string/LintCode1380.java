package string;

import java.util.Arrays;

//Link: https://www.lintcode.com/problem/log-sorting/description
//Title: Log Sorting
//Difficulty: Easy
public class LintCode1380 {
  /**
   * @param logs: the logs
   * @return: the log after sorting
   */
  public String[] logSort(String[] logs) {
    Arrays.sort(logs, (str1, str2) -> {
      int contentStart1 = str1.indexOf(" ");
      int contentStart2 = str2.indexOf(" ");

      boolean isDigit1 = Character.isDigit(str1.charAt(contentStart1 + 1));
      boolean isDigit2 = Character.isDigit(str2.charAt(contentStart2 + 1));
      if (isDigit1 && isDigit2) {
        return 0;
      }
      if (isDigit1) {
        return 1;
      }
      if (isDigit2) {
        return -1;
      }

      int compare = str1.substring(contentStart1 + 1).compareTo(str2.substring(contentStart2 + 1));
      if (compare != 0) {
        return compare;
      }
      return str1.substring(0, contentStart1).compareTo(str2.substring(0, contentStart2));
    });

    return logs;
  }
}
