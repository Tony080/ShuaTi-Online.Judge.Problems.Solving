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

    LintCode630 lintCode630 = new LintCode630();
    assertEquals(3, lintCode630.shortestPath2(test1));
    assertEquals(-1, lintCode630.shortestPath2(test2));
  }
}