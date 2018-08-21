package array;

//Link: https://www.lintcode.com/problem/can-place-flowers/description
//Title: Can Place Flowers
//Difficulty: Easy
public class LintCode1138 {
  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    // Write your code here
    int count = 0;
    int previous = flowerbed[0];
    for (int i = 1; i < flowerbed.length; i++) {
      if (flowerbed[i] == 0 && previous == 0) {
        flowerbed[i] = 1;
        count++;
      }
      previous = flowerbed[i];
    }

    return count >= n;
  }
}
