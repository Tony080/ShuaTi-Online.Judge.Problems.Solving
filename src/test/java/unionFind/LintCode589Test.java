package unionFind;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode589Test {

  @Test
  public void unionFind() {
    LintCode589 lintCode589 = new LintCode589(5);
    assertFalse(lintCode589.query(1, 2));
    lintCode589.connect(1, 2);
    assertFalse(lintCode589.query(1, 3));
    lintCode589.connect(2, 4);
    assertTrue(lintCode589.query(1, 4));
    lintCode589.connect(1, 4);
  }

}