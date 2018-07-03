package string;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode1173Test {

  @Test
  public void reverseWords() {
    String test1 = "Let's take LeetCode contest";
    String test2 = "a ";

    LintCode1173 lintCode1173 = new LintCode1173();
    assertEquals("s'teL ekat edoCteeL tsetnoc", lintCode1173.reverseWords(test1));
    assertEquals("a ", lintCode1173.reverseWords(test2));
  }
}