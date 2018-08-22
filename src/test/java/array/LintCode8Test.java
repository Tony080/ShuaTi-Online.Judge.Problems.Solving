package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode8Test {

  @Test
  public void rotateString() {
    char[] test1 = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
    char[] test2 = new char[0];

    LintCode8 lintCode8 = new LintCode8();
    lintCode8.rotateString(test1, 9);
    lintCode8.rotateString(test2, 3);
    assertArrayEquals(new char[] {'f', 'g', 'a', 'b', 'c', 'd', 'e'}, test1);
    assertArrayEquals(new char[0], test2);
  }
}