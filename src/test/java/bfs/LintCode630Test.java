package bfs;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LintCode630Test {

  @Test
  public void shortestPath2() {
    boolean[][] test1 = new boolean[3][4];
    boolean[][] test2 = new boolean[3][4];
    test2[2][1] = true;
    boolean[][] test3 = new boolean[3][4];
    test3[2][3] = true;
    boolean[][] test4 = new boolean[3][3];
    boolean[][] test5 = new boolean[1][1];

    LintCode630 lintCode630 = new LintCode630();
    assertEquals(3, lintCode630.shortestPath2(test1));
    assertEquals(-1, lintCode630.shortestPath2(test2));
    assertEquals(-1, lintCode630.shortestPath2(test3));
    assertEquals(-1, lintCode630.shortestPath2(test4));
    assertEquals(-1, lintCode630.shortestPath2(test5));
  }
}