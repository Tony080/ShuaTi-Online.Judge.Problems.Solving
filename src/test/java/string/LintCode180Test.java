package string;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode180Test {

  @Test
  public void binaryRepresentation() {
    String test1 = "3.72";
    String test2 = "3.5";
    String test3 = "0.0625";
    String test4 = "0.00000";
    String test5 = "999.125";

    LintCode180 lintCode180 = new LintCode180();
    assertEquals("ERROR", lintCode180.binaryRepresentation(test1));
    assertEquals("11.1", lintCode180.binaryRepresentation(test2));
    assertEquals("0.0001", lintCode180.binaryRepresentation(test3));
    assertEquals("0", lintCode180.binaryRepresentation(test4));
    assertEquals("1111100111.001", lintCode180.binaryRepresentation(test5));
  }
}