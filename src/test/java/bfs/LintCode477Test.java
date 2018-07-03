package bfs;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode477Test {

  @Test
  public void surroundedRegions() {
    char[][] test1 = null;
    char[][] test2 = new char[0][];
    char[][] test3 = new char[][] {{'X', 'X', 'X', 'X'}
                                  , {'X', 'O', 'O', 'X'}
                                  , {'X', 'X', 'O', 'X'}
                                  , {'X', 'O', 'X', 'X'}};

    char[][] test4 = new char[][] {{'X', 'O', 'X', 'O'}
                                  , {'X', 'O', 'O', 'X'}
                                  , {'O', 'X', 'O', 'X'}
                                  , {'X', 'O', 'X', 'X'}};

    char[][] test5 = new char[][] {{'X', 'O', 'X', 'X'}
                                  , {'X', 'O', 'X', 'X'}
                                  , {'O', 'X', 'O', 'O'}
                                  , {'O', 'X', 'O', 'X'}
                                  , {'X', 'O', 'X', 'X'}};

    LintCode477 lintCode477 = new LintCode477();
    lintCode477.surroundedRegions(test1);
    lintCode477.surroundedRegions(test2);
    lintCode477.surroundedRegions(test3);
    lintCode477.surroundedRegions(test4);
    lintCode477.surroundedRegions(test5);

    char[][] result1 = null;
    char[][] result2 = new char[0][];
    char[][] result3 = new char[][] {{'X', 'X', 'X', 'X'}
                                    , {'X', 'X', 'X', 'X'}
                                    , {'X', 'X', 'X', 'X'}
                                    , {'X', 'O', 'X', 'X'}};
    char[][] result4 = new char[][] {{'X', 'O', 'X', 'O'}
                                    , {'X', 'O', 'O', 'X'}
                                    , {'O', 'X', 'O', 'X'}
                                    , {'X', 'O', 'X', 'X'}};
    char[][] result5 = new char[][] {{'X', 'O', 'X', 'X'}
                                    , {'X', 'O', 'X', 'X'}
                                    , {'O', 'X', 'O', 'O'}
                                    , {'O', 'X', 'O', 'X'}
                                    , {'X', 'O', 'X', 'X'}};

    assertNull(test1);
    assertArrayEquals(result2, test2);
    assertArrayEquals(result3, test3);
    assertArrayEquals(result4, test4);
    assertArrayEquals(result5, test5);
  }
}