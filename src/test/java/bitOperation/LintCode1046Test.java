package bitOperation;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode1046Test {

  @Test
  public void countPrimeSetBits() {
    LintCode1046 lintCode1046 = new LintCode1046();
    assertEquals(4, lintCode1046.countPrimeSetBits(6, 10));
    assertEquals(5, lintCode1046.countPrimeSetBits(10, 15));
    assertEquals(307, lintCode1046.countPrimeSetBits(300, 900));
  }
}