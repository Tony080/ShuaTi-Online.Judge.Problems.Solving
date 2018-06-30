package string;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode200Test {

  @Test
  public void longestPalindrome() {
    String test1 = "aaabc";
    String test2 = "bbbb";
    String test3 = "a";
    String test4 = "bb";

    LintCode200 lintCode200 = new LintCode200();
    assertEquals("aaa", lintCode200.longestPalindrome(test1));
    assertEquals("bbbb", lintCode200.longestPalindrome(test2));
    assertEquals("a", lintCode200.longestPalindrome(test3));
    assertEquals("bb", lintCode200.longestPalindrome(test4));
  }
}