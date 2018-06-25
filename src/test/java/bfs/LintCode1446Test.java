package bfs;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode1446Test {

  @Test
  public void getBestRoad() {
    int[][] test1 = new int[][]{{0, 0, 0}, {0, 0, 1}, {0, 1, 1}};
    int[][] test2 = new int[][]{{0,1,0,0,0},{0,0,0,1,0},{1,1,0,1,0},{1,1,1,1,0}};
    int[][] test3 = new int[][]{{0,1,1},{1,1,0},{1,1,0}};
    int[][] test4 = new int[][]{{1,1,1}, {0, 0, 0}};

    LintCode1446 lintCode1446 = new LintCode1446();
    assertEquals(-1, lintCode1446.getBestRoad(test1));
    assertEquals(7, lintCode1446.getBestRoad(test2));
    assertEquals(-1, lintCode1446.getBestRoad(test3));
    assertEquals(3, lintCode1446.getBestRoad(test4));
  }
}