package stack;

import java.util.Stack;

//Link: https://www.lintcode.com/problem/next-greater-element-ii/description
//Title: Next Greater Element II
//Difficulty: Medium
public class LintCode1201 {
  public int[] nextGreaterElements(int[] nums) {
    // Write your code here
    int[] result = new int[nums.length];
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < nums.length; i++) {
      while (!stack.empty() && nums[i] > nums[stack.peek()]) {
        int index = stack.pop();
        result[index] = nums[i];
      }
      stack.push(i);
    }

    while (!stack.empty()) {
      int index = stack.pop();
      int i = 0;
      for (; i < index; i++) {
        if (nums[i] > nums[index]) {
          result[index] = nums[i];
          break;
        }
      }
      if (i == index) {
        result[index] = -1;
      }
    }
    return result;
  }
}
