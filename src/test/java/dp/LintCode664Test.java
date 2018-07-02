package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode664Test {

  @Test
  public void countBits() {
    int test1 = 4;
    int test2 = 10;

    LintCode664 lintCode664 = new LintCode664();
    assertArrayEquals(new int[] {0, 1, 1, 2, 1}, lintCode664.countBits(test1));
    assertArrayEquals(new int[] {0,1,1,2,1,2,2,3,1,2,2}, lintCode664.countBits(test2));
  }
}