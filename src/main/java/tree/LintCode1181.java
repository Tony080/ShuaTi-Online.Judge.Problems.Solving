package tree;

import bfs.LintCode726.TreeNode;

//Link: https://www.lintcode.com/problem/diameter-of-binary-tree/description
//Title: Diameter of Binary Tree
//Difficulty: Easy
public class LintCode1181 {
  private int max;

  public int diameterOfBinaryTree(TreeNode root) {
    // write your code here
    max = 0;
    helper(root);
    return max;
  }

  private int helper(TreeNode root) {
    int left = 0;
    int right = 0;
    if (root.left != null) {
      left = helper(root.left) + 1;
    }
    if (root.right != null) {
      right = helper(root.right) + 1;
    }

    int sum = left + right;
    max = Math.max(sum, max);
    return Math.max(left, right);
  }
}
