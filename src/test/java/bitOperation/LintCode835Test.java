package bitOperation;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode835Test {

  @Test
  public void hammingDistance() {
    int test11 = 1;
    int test12 = 4;

    LintCode835 lintCode835 = new LintCode835();
    assertEquals(2, lintCode835.hammingDistance(test11, test12));
  }
}