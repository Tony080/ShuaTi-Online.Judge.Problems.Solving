package unionFind;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode591Test {

  @Test
  public void test() {
    LintCode591 lintCode591 = new LintCode591(5);

    assertEquals(5, lintCode591.query());
    lintCode591.connect(1, 2);
    assertEquals(4, lintCode591.query());
    lintCode591.connect(2, 4);
    assertEquals(3, lintCode591.query());
    lintCode591.connect(1, 4);
    assertEquals(3, lintCode591.query());
  }
}