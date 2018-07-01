package bitOperation;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode181Test {

  @Test
  public void bitSwapRequired() {
    int test11 = 14;
    int test12 = 31;
    int test21 = 8;
    int test22 = 7;

    LintCode181 lintCode181 = new LintCode181();
    assertEquals(2, lintCode181.bitSwapRequired(test11, test12));
    assertEquals(4, lintCode181.bitSwapRequired(test21, test22));
  }
}