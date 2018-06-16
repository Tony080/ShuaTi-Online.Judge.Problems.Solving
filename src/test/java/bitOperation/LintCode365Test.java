package bitOperation;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode365Test {

  @Test
  public void countOnes() {
    LintCode365 lintCode365 = new LintCode365();
    assertEquals(32, lintCode365.countOnes(-1));
    assertEquals(1, lintCode365.countOnes(32));
  }
}