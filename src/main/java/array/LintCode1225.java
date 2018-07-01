package array;

//Link: https://www.lintcode.com/problem/island-perimeter/description
//Title: Island Perimeter
//Difficulty: Easy
public class LintCode1225 {
  public int islandPerimeter(int[][] grid) {
    int[] xBias = new int[]{0, 0, -1, 1};
    int[] yBias = new int[]{-1, 1, 0, 0};

    int result = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        if (grid[i][j] == 0) {
          continue;
        }
        int perimeter = 4;
        for (int k = 0; k < xBias.length; k++) {
          int newX = i + xBias[k];
          int newY = j + yBias[k];
          if (isValid(grid, newX, newY) && grid[newX][newY] == 1) {
            perimeter--;
          }
        }
        result += perimeter;
      }
    }
    return result;
  }

  private boolean isValid(int[][] grid, int newX, int newY) {
    return newX >= 0 && newY >= 0 && newX < grid.length && newY < grid[newX].length;
  }
}
