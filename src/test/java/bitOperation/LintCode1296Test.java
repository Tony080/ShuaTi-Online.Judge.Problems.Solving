package bitOperation;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode1296Test {

  @Test
  public void maxProduct() {
    String[] test1 = new String[] {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
    String[] test2 = new String[] {"a", "aa", "aaa", "aaaa"};
    String[] test3 = new String[] {"a", "ab", "abc", "d", "cd", "bcd", "abcd"};

    LintCode1296 lintCode1296 = new LintCode1296();
    assertEquals(16, lintCode1296.maxProduct(test1));
    assertEquals(0, lintCode1296.maxProduct(test2));
    assertEquals(4, lintCode1296.maxProduct(test3));
  }
}