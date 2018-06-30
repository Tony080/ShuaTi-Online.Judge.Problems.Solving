package string;

//Link: https://www.lintcode.com/problem/longest-palindromic-substring/description
//Title: Longest Palindromic Substring
//Difficulty: Medium
public class LintCode200 {
  /**
   * @param s: input string
   * @return: the longest palindromic substring
   */
  public String longestPalindrome(String s) {
    int length = s.length();
    int max = 0;
    int start = 0;
    for (int i = 0; i < length; i++) {
      int palindromLength = subPalindromLength(s, i, true);
      if (palindromLength > max) {
        max = palindromLength;
        start = i - palindromLength / 2;
      }
    }

    for (int i = 0; i < length; i++) {
      int palindromLength = subPalindromLength(s, i, false);
      if (palindromLength > max) {
        max = palindromLength;
        start = i - palindromLength / 2 + 1;
      }
    }

    return s.substring(start, start + max);
  }

  private int subPalindromLength(String s, int mid, boolean singleMid) {
    int length = s.length();
    int left;
    int right;
    if (singleMid) {
      left = mid - 1;
      right = mid + 1;
    } else {
      left = mid - 1;
      right = mid + 2;
      if (mid + 1 >= length || s.charAt(mid) != s.charAt(mid + 1)) {
        return 1;
      }
    }

    while (left >= 0 && right < length && s.charAt(left) == s.charAt(right)) {
      left--;
      right++;
    }
    return right - left - 1;
  }
}
