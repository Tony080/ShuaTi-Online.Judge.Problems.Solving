package bitOperation;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode1218Test {

  @Test
  public void findComplement() {
    int test1 = 5;
    int test2 = 1;

    LintCode1218 lintCode1218 = new LintCode1218();
    assertEquals(2, lintCode1218.findComplement(test1));
    assertEquals(0, lintCode1218.findComplement(test2));
  }
}