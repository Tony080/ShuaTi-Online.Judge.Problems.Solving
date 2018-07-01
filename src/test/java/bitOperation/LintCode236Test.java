package bitOperation;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode236Test {

  @Test
  public void swapOddEvenBits() {
    int test1 = 5;
    int test2 = 0;

    LintCode236 lintCode236 = new LintCode236();
    assertEquals(10, lintCode236.swapOddEvenBits(test1));
    assertEquals(0, lintCode236.swapOddEvenBits(test2));
  }
}