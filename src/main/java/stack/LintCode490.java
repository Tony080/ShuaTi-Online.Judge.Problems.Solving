package stack;

import java.util.Stack;

//Link: https://www.lintcode.com/problem/set-of-stacks/description
//Title: Set of Stacks
//Difficulty: Easy
public class LintCode490 {

  private int capacity;
  Stack<Stack<Integer>> stack;
  int count;
  public LintCode490(int capacity) {
    count = 0;
    this.capacity = capacity;
    stack = new Stack<>();
    stack.push(new Stack<Integer>());
  }

  public void push(int v) {
    if (count == capacity) {
      Stack<Integer> newStack = new Stack<>();
      newStack.push(v);
      count = 1;
      stack.push(newStack);
    } else {
      stack.peek().push(v);
      count++;
    }
  }

  public int pop() {
    if (stack.peek().empty()) {
      stack.pop();
      count = stack.peek().size() - 1;
    } else {
      count--;
    }
    return stack.peek().pop();
  }
}
