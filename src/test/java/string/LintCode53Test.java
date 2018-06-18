package string;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode53Test {

  @Test
  public void reverseWords() {
    String test1 = "";
    String test2 = "the sky is blue";
    String test3 = "ab  cd ef gh ";

    LintCode53 lintCode53 = new LintCode53();
    assertEquals("", lintCode53.reverseWords(test1));
    assertEquals("blue is sky the", lintCode53.reverseWords(test2));
    assertEquals("gh ef cd ab", lintCode53.reverseWords(test3));
  }
}