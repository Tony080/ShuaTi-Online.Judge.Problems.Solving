package bitOperation;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode179Test {

  @Test
  public void updateBits() {
    int test1n = -512;
    int test1m = 0;
    int test1i = 31;
    int test1j = 31;

    int test2n = 1024;
    int test2m = 21;
    int test2i = 2;
    int test2j = 6;
    LintCode179 lintCode179 = new LintCode179();
    assertEquals(2147483136, lintCode179.updateBits(test1n, test1m, test1i, test1j));
    assertEquals(1108, lintCode179.updateBits(test2n, test2m, test2i, test2j));
  }
}