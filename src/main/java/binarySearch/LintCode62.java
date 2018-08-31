package binarySearch;

//Link: https://www.lintcode.com/problem/search-in-rotated-sorted-array/description
//Title: Search in Rotated Sorted Array
//Difficulty: Medium
public class LintCode62 {
  public int search(int[] A, int target) {
    // write your code here
    int start = 0;
    int end = A.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      System.out.println(A[mid]);
      if (A[mid] == target) {
        return mid;
      } else if (A[mid] < target) {
        if (A[mid] < A[start] && A[start] <= target) {
          end = mid - 1;
        } else {//Normal case
          start = mid + 1;
        }
      } else {
        if (A[mid] > A[end] && target <= A[end]) {
          start = mid + 1;
        } else {//Normal case
          end = mid - 1;
        }
      }
    }
    return -1;
  }
}
