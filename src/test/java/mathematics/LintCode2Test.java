package mathematics;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode2Test {

  @Test
  public void trailingZeros() {
    long test1 = 11;
    long test2 = 16;

    LintCode2 lintCode2 = new LintCode2();
    assertEquals(2, lintCode2.trailingZeros(test1));
    assertEquals(3, lintCode2.trailingZeros(test2));
  }
}