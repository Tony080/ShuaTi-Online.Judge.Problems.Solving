package string;

import java.util.Arrays;

//Link: https://www.lintcode.com/problem/next-greater-element-iii/description
//Title: Next Greater Element III
//Difficulty: Medium
public class LintCode1174 {
  public int nextGreaterElement(int n) {
    // Write your code here
    char[] num = Integer.toString(n).toCharArray();

    for (int i = num.length - 1; i > 0; i--) {
      if (num[i] > num[i - 1]) {
        int smallestIndex = i;
        for (int j = i + 1; j < num.length; j++) {
          if (num[j] < num[smallestIndex] && num[j] > num[i - 1]) {
            smallestIndex = j;
          }
        }
        char temp = num[i - 1];
        num[i - 1] = num[smallestIndex];
        num[smallestIndex] = temp;
        Arrays.sort(num, i, num.length);
        long result = Long.parseLong(new String(num));
        if (result > Integer.MAX_VALUE) {
          return -1;
        }
        return (int)result;
      }
    }
    return -1;
  }
}
