package bitOperation;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode721Test {

  @Test
  public void nextSparseNum() {
    int test1 = 6;
    int test2 = 4;
    int test3 = 44;

    LintCode721 lintCode721 = new LintCode721();
    assertEquals(8, lintCode721.nextSparseNum(test1));
    assertEquals(4, lintCode721.nextSparseNum(test2));
    assertEquals(64, lintCode721.nextSparseNum(test3));
  }
}