package bfs;

import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode726Test {

  @Test
  public void isFullTree() {
    LintCode726.TreeNode test1 = new LintCode726.TreeNode(1);
    test1.left = new LintCode726.TreeNode(2);
    test1.right = new LintCode726.TreeNode(3);

    LintCode726.TreeNode test2 = new LintCode726.TreeNode(1);
    test2.left = new LintCode726.TreeNode(2);
    test2.right = new LintCode726.TreeNode(3);
    test2.left.left = new LintCode726.TreeNode(4);
    LintCode726 lintCode726 = new LintCode726();


    assertTrue(lintCode726.isFullTree(test1));
    assertFalse(lintCode726.isFullTree(test2));
  }
}