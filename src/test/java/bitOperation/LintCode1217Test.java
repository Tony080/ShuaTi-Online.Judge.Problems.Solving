package bitOperation;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode1217Test {

  @Test
  public void totalHammingDistance() {
    int[] test1 = new int[] {4, 14, 2};

    LintCode1217 lintCode1217 = new LintCode1217();
    assertEquals(6, lintCode1217.totalHammingDistance(test1));
  }
}