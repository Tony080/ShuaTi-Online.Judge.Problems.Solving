package string;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode1174Test {

  @Test
  public void nextGreaterElement() {
    int test1 = 12345;
    int test2 = 54321;
    int test3 = 1999999999;
    int test4 = 1321;

    LintCode1174 lintCode1174 = new LintCode1174();
    assertEquals(12354, lintCode1174.nextGreaterElement(test1));
    assertEquals(-1, lintCode1174.nextGreaterElement(test2));
    assertEquals(-1, lintCode1174.nextGreaterElement(test3));
    assertEquals(2113, lintCode1174.nextGreaterElement(test4));
  }
}