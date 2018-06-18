package string;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode1380Test {

  @Test
  public void logSort() {
    String[] test1 = new String[] {
        "zo4 4 7",
        "a100 Actzoo",
        "a100 Act zoo",
        "Tac Bctzoo",
        "Tab Bctzoo",
        "g9 act car",
        "zo3 9 3",
        "abcc 33 0"
    };

    String[] sorted1 = new String[] {
        "a100 Act zoo",
        "a100 Actzoo",
        "Tab Bctzoo",
        "Tac Bctzoo",
        "g9 act car",
        "zo4 4 7",
        "zo3 9 3",
        "abcc 33 0"
    };
    LintCode1380 lintCode1380 = new LintCode1380();
    assertArrayEquals(sorted1, lintCode1380.logSort(test1));
  }
}