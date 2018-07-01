package bitOperation;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode1285Test {

  @Test
  public void isPowerOfFour() {
    int test1 = 16;
    int test2 = 8;
    int test3 = 0;
    int test4 = 7;

    LintCode1285 lintCode1285 = new LintCode1285();
    assertTrue(lintCode1285.isPowerOfFour(test1));
    assertFalse(lintCode1285.isPowerOfFour(test2));
    assertFalse(lintCode1285.isPowerOfFour(test3));
    assertFalse(lintCode1285.isPowerOfFour(test4));
  }
}