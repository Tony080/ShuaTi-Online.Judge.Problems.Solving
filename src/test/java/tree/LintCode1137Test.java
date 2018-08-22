package tree;

import org.junit.Test;
import bfs.LintCode726.TreeNode;

import static org.junit.Assert.*;

public class LintCode1137Test {

  @Test
  public void tree2str() {
    TreeNode test1 = new TreeNode(1);
    test1.left = new TreeNode(2);
    test1.right = new TreeNode(3);
    test1.left.left = new TreeNode(4);

    TreeNode test2 = new TreeNode(1);
    test2.left = new TreeNode(2);
    test2.right = new TreeNode(3);
    test2.left.right = new TreeNode(4);

    LintCode1137 lintCode1137 = new LintCode1137();
    assertEquals("1(2(4))(3)", lintCode1137.tree2str(test1));
    assertEquals("1(2()(4))(3)", lintCode1137.tree2str(test2));
  }
}