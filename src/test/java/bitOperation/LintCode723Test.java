package bitOperation;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode723Test {

  @Test
  public void leftRotate() {
    int test1n = 123;
    int test1d = 4;

    LintCode723 lintCode723 = new LintCode723();
    assertEquals(1968, lintCode723.leftRotate(test1n, test1d));
  }
}