package string;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode1193Test {

  @Test
  public void detectCapitalUse() {
    String test1 = "Google";
    String test2 = "lintcode";
    String test3 = "USa";

    LintCode1193 lintCode1193 = new LintCode1193();
    assertTrue(lintCode1193.detectCapitalUse(test1));
    assertTrue(lintCode1193.detectCapitalUse(test2));
    assertFalse(lintCode1193.detectCapitalUse(test3));
  }
}