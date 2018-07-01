package bitOperation;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode142Test {

  @Test
  public void checkPowerOf2() {
    int test1 = 8;
    int test2 = 7;
    int test3 = (int)Math.pow(2, 10);
    int test4 = 0;

    LintCode142 lintCode142 = new LintCode142();
    assertTrue(lintCode142.checkPowerOf2(test1));
    assertFalse(lintCode142.checkPowerOf2(test2));
    assertTrue(lintCode142.checkPowerOf2(test3));
    assertFalse(lintCode142.checkPowerOf2(test4));
  }
}