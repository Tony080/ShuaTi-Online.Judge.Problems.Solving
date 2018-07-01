package bitOperation;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode987Test {

  @Test
  public void hasAlternatingBits() {
    int test1 = 5;
    int test2 = 7;
    int test3 = 10;
    int test4 = 11;

    LintCode987 lintCode987 = new LintCode987();
    assertTrue(lintCode987.hasAlternatingBits(test1));
    assertFalse(lintCode987.hasAlternatingBits(test2));
    assertTrue(lintCode987.hasAlternatingBits(test3));
    assertFalse(lintCode987.hasAlternatingBits(test4));
  }
}