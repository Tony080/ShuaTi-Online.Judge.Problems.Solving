package bitOperation;

//Link: https://www.lintcode.com/problem/count-1-in-binary/description
//Title: Count 1 in Binary
//Difficulty: Easy
public class LintCode365 {
  public int countOnes(int num) {
    int count = 0;
    while (num != 0) {
      num = num & (num - 1);
      count++;
    }
    return count;
  }
}
