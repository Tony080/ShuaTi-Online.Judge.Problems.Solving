package bfs;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode750Test {

  @Test
  public void portal() {
    char[][] test1 = new char[][] {{'S', 'E', '*'}, {'*', '*', '*'}, {'*', '*', '*'}};
    char[][] test2 = new char[][] {{'E', '#', '*'}, {'#','*', '*'}, {'*', '*', 'S'}};
    char[][] test3 = new char[][] {{'S', '#', '*'}, {'*', '*', '*'}, {'#', 'E', '*'}};

    LintCode750 lintCode750 = new LintCode750();
    assertEquals(1, lintCode750.Portal(test1));
    assertEquals(-1, lintCode750.Portal(test2));
    assertEquals(3, lintCode750.Portal(test3));
  }
}