package unionFind;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode433Test {

  @Test
  public void numIslands() {
    boolean[][] test1 = new boolean[5][5];
    test1[0][0] = true;
    test1[0][1] = true;
    test1[1][1] = true;
    test1[1][4] = true;
    test1[2][4] = true;
    test1[2][3] = true;
    test1[4][4] = true;

    boolean[][] test2 = new boolean[0][];

    boolean[][] test3 = new boolean[5][5];
    test3[1][1] = true;
    LintCode433 lintCode433 = new LintCode433();
    assertEquals(3, lintCode433.numIslands(test1));
    assertEquals(0, lintCode433.numIslands(test2));
    assertEquals(1, lintCode433.numIslands(test3));
  }
}