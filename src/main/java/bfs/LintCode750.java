package bfs;

import java.util.LinkedList;
import java.util.Queue;

//Link: https://www.lintcode.com/problem/portal/description
//Title: Portal
//Difficulty: Medium
public class LintCode750 {
  static class Coordinate {
    int x;
    int y;

    public Coordinate(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }
  /**
   * @param Maze:
   * @return: nothing
   */
  public int Portal(char[][] Maze) {
    Coordinate entrancePoint = findEntrance(Maze);
    int level = 0;
    int[] xBias = new int[]{0, 0, -1, 1};
    int[] yBias = new int[]{-1, 1, 0, 0};
    boolean[][] visited = new boolean[Maze.length][Maze[0].length];

    Queue<Coordinate> queue = new LinkedList<>();
    queue.offer(entrancePoint);
    Maze[entrancePoint.x][entrancePoint.y] = '#';

    while(!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        Coordinate current = queue.poll();
        if (Maze[current.x][current.y] == 'E') {
          return level;
        }

        for (int j = 0; j < xBias.length; j++) {
          int newX = current.x + xBias[j];
          int newY = current.y + yBias[j];
          if (isValid(Maze, newX, newY) && !visited[newX][newY]) {
            queue.offer(new Coordinate(newX, newY));
            visited[newX][newY] = true;
          }
        }
      }
      level++;
    }
    return -1;
  }

  private Coordinate findEntrance(char[][] Maze) {
    int x = 0;
    int y = 0;
    for (int i = 0; i < Maze.length; i++) {
      for (int j = 0; j < Maze[0].length; j++) {
        if (Maze[i][j] == 'S') {
          x = i;
          y = j;
          break;
        }
      }
    }
    return new Coordinate(x, y);
  }

  private boolean isValid(char[][] Maze, int newX, int newY) {
    return newX >= 0 && newY>=0 && newX < Maze.length && newY < Maze[0].length && Maze[newX][newY] != '#';
  }
}
