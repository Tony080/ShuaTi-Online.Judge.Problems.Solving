package bitOperation;

//Link: https://www.lintcode.com/problem/total-hamming-distance/description
//Title: Total Hamming Distance
//Difficulty: Medium
public class LintCode1217 {
  public int totalHammingDistance(int[] nums) {
    int distance = 0;
    for (int i = 0; i < 32; i++) {
      int ones = 0;
      for (int num : nums) {
        ones += (num >>> i) & 1;
      }
      int zeros = nums.length - ones;
      distance += zeros * ones;
    }
    return distance;
  }
}
