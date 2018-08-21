package binarySearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode1056Test {

  @Test
  public void nextGreatestLetter() {
    char[] test1Letters = new char[] {'c', 'f', 'j'};
    char[] test2Letters = new char[] {'e', 'e', 'e', 'e', 'e', 'n'};

    LintCode1056 lintCode1056 = new LintCode1056();
    assertEquals('c', lintCode1056.nextGreatestLetter(test1Letters, 'a'));
    assertEquals('f', lintCode1056.nextGreatestLetter(test1Letters, 'c'));
    assertEquals('f', lintCode1056.nextGreatestLetter(test1Letters, 'd'));
    assertEquals('j', lintCode1056.nextGreatestLetter(test1Letters, 'g'));
    assertEquals('c', lintCode1056.nextGreatestLetter(test1Letters, 'j'));
    assertEquals('c', lintCode1056.nextGreatestLetter(test1Letters, 'k'));
    assertEquals('c', lintCode1056.nextGreatestLetter(test1Letters, 'a'));
    assertEquals('n', lintCode1056.nextGreatestLetter(test2Letters, 'e'));

  }
}