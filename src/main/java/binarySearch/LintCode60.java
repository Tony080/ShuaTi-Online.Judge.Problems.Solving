package binarySearch;

//Link: https://www.lintcode.com/problem/search-insert-position/description
//Title: Search Insert Position
//Difficulty: Easy
public class LintCode60 {
  public int searchInsert(int[] A, int target) {
    // write your code here
    if (A.length == 0) {
      return 0;
    }
    int start = 0;
    int end = A.length - 1;
    while (start < end) {
      int mid = (start + end) / 2;
      if (A[mid] == target) {
        return mid;
      } else if (A[mid] < target){
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return A[start] < target ? start + 1 : start;
  }
}
