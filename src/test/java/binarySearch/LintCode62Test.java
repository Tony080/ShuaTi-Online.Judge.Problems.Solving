package binarySearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode62Test {

  @Test
  public void search() {
    int[] test1 = new int[] {0,1,2,-10,-9,-8,-7,-6,-5,-4,-3,-2,-1};
    int[] test2 = new int[] {1,2,3};
    int[] test3 = new int[] {3,4,1,2};

    LintCode62 lintCode62 = new LintCode62();
    assertEquals(0, lintCode62.search(test1, 0));
    assertEquals(1, lintCode62.search(test1, 1));
    assertEquals(2, lintCode62.search(test1, 2));
    assertEquals(3, lintCode62.search(test1, -10));
    assertEquals(11, lintCode62.search(test1, -2));

    assertEquals(0, lintCode62.search(test2, 1));
    assertEquals(1, lintCode62.search(test2, 2));
    assertEquals(2, lintCode62.search(test2, 3));

    assertEquals(0, lintCode62.search(test3, 3));
    assertEquals(1, lintCode62.search(test3, 4));
    assertEquals(2, lintCode62.search(test3, 1));
    assertEquals(3, lintCode62.search(test3, 2));
    assertEquals(-1, lintCode62.search(test3, 0));
    assertEquals(-1, lintCode62.search(test3, 6));
  }
}