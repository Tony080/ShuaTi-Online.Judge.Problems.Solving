package bfs;

import java.util.LinkedList;
import java.util.Queue;

//Link: https://www.lintcode.com/problem/check-full-binary-tree/description
//Title: Check Full Binary Tree
//Difficulty: Medium
public class LintCode726 {
  public static class TreeNode {
    public int val;
    public TreeNode left, right;

    public TreeNode(int val) {
      this.val = val;
      this.left = this.right = null;
    }
  }


  /**
   * @param root: the given tree
   * @return: Whether it is a full tree
   */
  public boolean isFullTree(TreeNode root) {
    // write your code here
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      if (node.left == null && node.right == null) {
        continue;
      }
      if (node.left == null || node.right == null) {
        return false;
      }
      queue.offer(node.left);
      queue.offer(node.right);
    }
    return true;
  }

}
