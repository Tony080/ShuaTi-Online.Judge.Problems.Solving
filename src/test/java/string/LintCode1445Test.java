package string;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode1445Test {

  @Test
  public void canGetString() {
    String test1s = "abc";
    String test1t = "c";

    String test2s = "a";
    String test2t = "c";

    String test3s = "abcderf";
    String test3t = "bdr";

    LintCode1445 lintCode1445 = new LintCode1445();
    assertTrue(lintCode1445.canGetString(test1s, test1t));
    assertFalse(lintCode1445.canGetString(test2s, test2t));
    assertTrue(lintCode1445.canGetString(test3s, test3t));
  }
}