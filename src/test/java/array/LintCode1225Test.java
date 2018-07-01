package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode1225Test {

  @Test
  public void islandPerimeter() {
    int[][] test1 = new int[][]{{0,1,0,0},
                                {1,1,1,0},
                                {0,1,0,0},
                                {1,1,0,0}};
    int[][] test2 = new int[][]{{0,1,0,0},
                                {1,1,1,1},
                                {0,1,0,0},
                                {1,1,0,0}};

    LintCode1225 lintCode1225 = new LintCode1225();
    assertEquals(16, lintCode1225.islandPerimeter(test1));
    assertEquals(18, lintCode1225.islandPerimeter(test2));
  }
}