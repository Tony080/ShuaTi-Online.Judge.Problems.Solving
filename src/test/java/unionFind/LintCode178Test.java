package unionFind;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode178Test {

  @Test
  public void validTree() {
    int[][] test1 = new int[][] {{0, 1}, {1, 2}, {2, 3}, {1, 3}, {1, 4}};
    int[][] test2 = new int[][] {{0, 1}, {0, 2}, {0, 3}, {1, 4}};
    int[][] test3 = new int[][] {};

    LintCode178 lintCode178 = new LintCode178();
    assertFalse(lintCode178.validTree(5, test1));
    assertTrue(lintCode178.validTree(5, test2));
    assertFalse(lintCode178.validTree(5, test3));
  }
}