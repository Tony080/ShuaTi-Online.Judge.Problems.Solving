package mathematics;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode1259Test {

  @Test
  public void integerReplacement() {
    int test1 = 8;
    int test2 = 7;
    int test3 = 13;
    int test4 = 333;

    LintCode1259 lintCode1259 = new LintCode1259();
    assertEquals(3, lintCode1259.integerReplacement(test1));
    assertEquals(4, lintCode1259.integerReplacement(test2));
    assertEquals(5, lintCode1259.integerReplacement(test3));
    assertEquals(12, lintCode1259.integerReplacement(test4));
  }
}