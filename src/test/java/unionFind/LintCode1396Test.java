package unionFind;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode1396Test {

  @Test
  public void setUnion() {
    int[][] test1 = new int[][] {
        {1,2,3},
        {4,5,6},
        {1,3,4},
        {333,444,555, 999}
    };

    LintCode1396 lintCode1396 = new LintCode1396();
    assertEquals(2, lintCode1396.setUnion(test1));
  }
}