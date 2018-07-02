package bitOperation;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode1262Test {

  @Test
  public void validUtf8() {
    int[] test1 = null;
    int[] test2 = new int[0];
    int[] test3 = new int[] {197, 130, 1};
    int[] test4 = new int[] {235, 140, 4};
    int[] test5 = new int[] {197};
    int[] test6 = new int[] {0x80};
    int[] test7 = new int[] {0xF7, 0x80, 0x80, 0x80};

    LintCode1262 lintCode1262 = new LintCode1262();
    assertFalse(lintCode1262.validUtf8(test1));
    assertFalse(lintCode1262.validUtf8(test2));
    assertTrue(lintCode1262.validUtf8(test3));
    assertFalse(lintCode1262.validUtf8(test4));
    assertFalse(lintCode1262.validUtf8(test5));
    assertFalse(lintCode1262.validUtf8(test6));
    assertTrue(lintCode1262.validUtf8(test7));
  }
}