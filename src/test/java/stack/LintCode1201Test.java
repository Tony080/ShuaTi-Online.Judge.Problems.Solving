package stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode1201Test {

  @Test
  public void nextGreaterElements() {
    int[] test1 = new int[] {1, 2, 1};
    int[] test2 = new int[] {5, 4, 3, 2, 1};

    LintCode1201 lintCode1201 = new LintCode1201();
    assertArrayEquals(new int[] {2, -1, 2}, lintCode1201.nextGreaterElements(test1));
    assertArrayEquals(new int[] {-1, 5, 5, 5, 5}, lintCode1201.nextGreaterElements(test2));
  }
}