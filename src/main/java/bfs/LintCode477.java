package bfs;

import java.util.LinkedList;
import java.util.Queue;

//Link: https://www.lintcode.com/problem/surrounded-regions/description
//Title: Surrounded Regions
//Difficulty: Medium
public class LintCode477 {
  public void surroundedRegions(char[][] board) {
    if (board == null || board.length == 0) {
      return;
    }
    int[] xBias = new int[] {0, 0, -1, 1};
    int[] yBias = new int[] {-1, 1, 0, 0};
    int row = board[0].length - 1;
    int col = board.length - 1;
    Queue<int[]> queue = new LinkedList<>();
    boolean[][] set = new boolean[board.length][board[0].length];

    for (int i = 0; i < board[0].length; i++) {
      if (board[0][i] == 'O') {
        board[0][i] = 'I';
        queue.offer(new int[] {0, i});
        set[0][i] = true;
      }
      if (board[col][i] == 'O') {
        board[col][i] = 'I';
        queue.offer(new int[] {col, i});
        set[col][i] = true;
      }
    }
    for (int i = 0; i < board.length; i++) {
      if (board[i][0] == 'O') {
        board[i][0] = 'I';
        queue.offer(new int[] {i, 0});
        set[i][0] = true;
      }
      if (board[i][row] == 'O') {
        board[i][row] = 'I';
        queue.offer(new int[] {i, row});
        set[i][row] = true;
      }
    }

    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      for (int i = 0; i < xBias.length; i++) {
        int newX = current[0] + xBias[i];
        int newY = current[1] + yBias[i];
        if (!isValid(board, newX, newY) || set[newX][newY] || board[newX][newY] != 'O') {
          continue;
        }
        board[newX][newY] = 'I';
        set[newX][newY] = true;
        queue.offer(new int[] {newX, newY});
      }
    }

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        if (board[i][j] == 'I') {
          board[i][j] = 'O';
        } else {
          board[i][j] = 'X';
        }
      }
    }
  }

  private boolean isValid(char[][] board, int newX, int newY) {
    return newX >= 0 && newY >= 0 && newX < board.length && newY < board[newX].length;
  }
}
