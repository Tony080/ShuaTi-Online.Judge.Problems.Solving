package stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode490Test {

  @Test
  public void setOfStacks() {
    LintCode490 test1 = new LintCode490(2);
    test1.push(1);
    test1.push(2);
    test1.push(4);
    test1.push(8);
    test1.push(16);
    assertEquals(16, test1.pop());
    assertEquals(8, test1.pop());
    assertEquals(4, test1.pop());
    assertEquals(2, test1.pop());
    assertEquals(1, test1.pop());
  }
}