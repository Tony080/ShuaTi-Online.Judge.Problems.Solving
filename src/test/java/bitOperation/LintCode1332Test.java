package bitOperation;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode1332Test {

  @Test
  public void hammingWeight() {
    int test1 = 11;
    int test2 = 8;

    LintCode1332 lintCode1332 = new LintCode1332();
    assertEquals(3, lintCode1332.hammingWeight(test1));
    assertEquals(1, lintCode1332.hammingWeight(test2));
  }
}