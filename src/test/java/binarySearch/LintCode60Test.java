package binarySearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode60Test {

  @Test
  public void searchInsert() {
    int[] test1 = new int[] {1,3,4,7,9};
    int[] test2 = new int[] {1,2,4,6};
    int[] test3 = new int[0];
    int[] test4 = new int[] {1};

    LintCode60 lintCode60 = new LintCode60();
    assertEquals(0, lintCode60.searchInsert(test1, 0));
    assertEquals(1, lintCode60.searchInsert(test1, 2));
    assertEquals(2, lintCode60.searchInsert(test1, 4));
    assertEquals(4, lintCode60.searchInsert(test1, 9));
    assertEquals(5, lintCode60.searchInsert(test1, 11));
    assertEquals(0, lintCode60.searchInsert(test2, 0));
    assertEquals(1, lintCode60.searchInsert(test2, 2));
    assertEquals(2, lintCode60.searchInsert(test2, 3));
    assertEquals(3, lintCode60.searchInsert(test2, 6));
    assertEquals(4, lintCode60.searchInsert(test2, 33));
    assertEquals(0, lintCode60.searchInsert(test3, 6));
    assertEquals(0, lintCode60.searchInsert(test4, 0));
    assertEquals(0, lintCode60.searchInsert(test4, 1));
    assertEquals(1, lintCode60.searchInsert(test4, 6));
  }
}