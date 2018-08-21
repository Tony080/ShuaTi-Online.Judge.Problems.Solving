package binarySearch;

//Link: https://www.lintcode.com/problem/find-smallest-letter-greater-than-target/description
//Title: Find Smallest Letter Greater Than Target
//Difficulty: Easy
public class LintCode1056 {
  public char nextGreatestLetter(char[] letters, char target) {
    // Write your code here
    int left = 0;
    int right = letters.length - 1;
    while (left + 1 <= right) {
      int mid = (left + right) / 2;
      if (letters[mid] == target) {
        left = mid;
        break;
      } else if (letters[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    if (letters[left] > target) {
      return letters[left];
    }
    while ((++left) < letters.length) {
      if (letters[left] > target) {
        return letters[left];
      }
    }
    return letters[0];
  }
}
