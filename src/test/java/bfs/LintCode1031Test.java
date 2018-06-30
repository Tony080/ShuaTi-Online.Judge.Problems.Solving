package bfs;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode1031Test {

  @Test
  public void isBipartite() {
    int[][] test1 = new int[][] {{1,3}, {0,2}, {1,3}, {0,2}};
    int[][] test2 = new int[][] {{1,2,3}, {0,2}, {0,1,3}, {0,2}};

    LintCode1031 lintCode1031 = new LintCode1031();
    assertTrue(lintCode1031.isBipartite(test1));
    assertFalse(lintCode1031.isBipartite(test2));
  }
}