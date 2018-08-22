package tree;

import bfs.LintCode726.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class LintCode1181Test {

  @Test
  public void diameterOfBinaryTree() {
    TreeNode test1 = new TreeNode(1);
    test1.left = new TreeNode(2);
    test1.right = new TreeNode(3);
    test1.left.left = new TreeNode(4);
    test1.left.right = new TreeNode(5);

    TreeNode test2 = new TreeNode(1);
    test2.left = new TreeNode(2);
    test2.left.left = new TreeNode(3);

    TreeNode test3 = new TreeNode(1);
    test3.right = new TreeNode(2);
    test3.right.right = new TreeNode(3);

    LintCode1181 lintCode1181 = new LintCode1181();
    assertEquals(3, lintCode1181.diameterOfBinaryTree(test1));
    assertEquals(2, lintCode1181.diameterOfBinaryTree(test2));
    assertEquals(2, lintCode1181.diameterOfBinaryTree(test3));
  }
}