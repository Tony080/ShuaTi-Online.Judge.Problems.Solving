package bitOperation;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode774Test {

  @Test
  public void findRepeatedDna() {
    String test1 = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
    String test2 = "";
    String test3 = "AAAAAAAAAAAAAAA";

    LintCode774 lintCode774 = new LintCode774();
    assertArrayEquals(new String[] {"AAAAACCCCC", "CCCCCAAAAA"}, lintCode774.findRepeatedDna(test1).toArray());
    assertArrayEquals(new String[0], lintCode774.findRepeatedDna(test2).toArray());
    assertArrayEquals(new String[] {"AAAAAAAAAA"}, lintCode774.findRepeatedDna(test3).toArray());
  }
}