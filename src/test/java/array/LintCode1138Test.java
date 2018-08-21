package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode1138Test {

  @Test
  public void canPlaceFlowers() {
    int[] test1Bed = new int[] {1, 0, 0, 0, 1};
    int test1n = 1;
    int test2n = 2;

    LintCode1138 lintCode1138 = new LintCode1138();
    assertTrue(lintCode1138.canPlaceFlowers(test1Bed, test1n));
    assertFalse(lintCode1138.canPlaceFlowers(test1Bed, test2n));
  }
}