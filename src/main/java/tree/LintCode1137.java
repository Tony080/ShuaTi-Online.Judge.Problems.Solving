package tree;

import bfs.LintCode726.TreeNode;

//Link: https://www.lintcode.com/problem/diameter-of-binary-tree/description
//Title: Diameter of Binary Tree
//Difficulty: Easy
public class LintCode1137 {
  private StringBuilder sb;
  public String tree2str(TreeNode t) {
    // write your code here
    sb = new StringBuilder();
    helper(t);
    return sb.toString();
  }

  private boolean helper(TreeNode t) {
    if (t == null) {
      return true;
    }
    sb.append(t.val);

    int index = sb.length();
    sb.append('(');
    boolean leftIsNull = helper(t.left);
    sb.append(')');

    sb.append('(');
    int size = sb.length();
    boolean rightIsNull = helper(t.right);
    if (leftIsNull && rightIsNull) {
      sb.setLength(index);
    } else if (rightIsNull) {
      sb.setLength(size - 1);
    } else {
      sb.append(')');
    }

    return false;
  }
}
