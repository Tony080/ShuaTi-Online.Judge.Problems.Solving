package mathematics;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode1294Test {

  @Test
  public void isPowerOfThree() {
    int test1 = 0;
    int test2 = 1;
    int test3 = 3;
    int test4 = 2;
    int test5 = 9;
    int test6 = 27;
    int test7 = 81;
    int test8 = 54;

    LintCode1294 lintCode1294 = new LintCode1294();
    assertFalse(lintCode1294.isPowerOfThree(test1));
    assertTrue(lintCode1294.isPowerOfThree(test2));
    assertTrue(lintCode1294.isPowerOfThree(test3));
    assertFalse(lintCode1294.isPowerOfThree(test4));
    assertTrue(lintCode1294.isPowerOfThree(test5));
    assertTrue(lintCode1294.isPowerOfThree(test6));
    assertTrue(lintCode1294.isPowerOfThree(test7));
    assertFalse(lintCode1294.isPowerOfThree(test8));
  }
}