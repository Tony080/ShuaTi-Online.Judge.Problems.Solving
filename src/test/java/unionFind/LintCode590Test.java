package unionFind;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode590Test {

  @Test
  public void test() {
    LintCode590 lintCode590 = new LintCode590(5);

    assertEquals(1, lintCode590.query(1));
    lintCode590.connect(1, 2);
    assertEquals(2, lintCode590.query(2));
    lintCode590.connect(2, 4);
    assertEquals(3, lintCode590.query(1));
    lintCode590.connect(1, 4);
    assertEquals(3, lintCode590.query(1));
  }
}