package string;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode420Test {

  @Test
  public void countAndSay() {
    int test1 = 5;
    int test2 = 11;

    LintCode420 lintCode420 = new LintCode420();
    assertEquals("111221", lintCode420.countAndSay(test1));
    assertEquals("11131221133112132113212221", lintCode420.countAndSay(test2));
  }
}