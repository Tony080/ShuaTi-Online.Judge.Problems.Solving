package unionFind;

import org.junit.Test;
import unionFind.LintCode434.Point;

import static org.junit.Assert.*;

public class LintCode434Test {

  @Test
  public void numIslands2() {
    Point[] test1p = new Point[] {new Point(), new Point(0, 1), new Point(2, 2), new Point(2, 1)};
    int test1m = 3;
    int test1n = 3;
    Point[] test2p = new Point[] {new Point(), new Point(0, 1), new Point(2, 2), new Point(2, 2)};
    int test2m = 5;
    int test2n = 6;
    Point[] test3p = new Point[] {new Point(), new Point(0, 1), new Point(2, 2), new Point(3, 3)};
    int test3m = 5;
    int test3n = 6;
    Point[] test4p = null;
    int test4m = 5;
    int test4n = 6;
    Point[] test5p = new Point[] {new Point(), new Point(0, 1), new Point(2, 2), new Point(3, 3), new Point(3, 4), new Point(4, 3), new Point(5, 3)};
    int test5m = 5;
    int test5n = 6;
    Point[] test6p = new Point[] {new Point(), new Point(1, 0), new Point(0, 1), new Point(1, 1), new Point(2, 2), new Point(3, 3), new Point(3, 4), new Point(4, 3), new Point(5, 3)};
    int test6m = 5;
    int test6n = 6;

    LintCode434 lintCode434 = new LintCode434();
    assertArrayEquals(new Integer[] {1, 1, 2, 2}, lintCode434.numIslands2(test1n, test1m, test1p).toArray());
    assertArrayEquals(new Integer[] {1, 1, 2, 2}, lintCode434.numIslands2(test2n, test2m, test2p).toArray());
    assertArrayEquals(new Integer[] {1, 1, 2, 3}, lintCode434.numIslands2(test3n, test3m, test3p).toArray());
    assertArrayEquals(new Integer[0], lintCode434.numIslands2(test4n, test4m, test4p).toArray());
    assertArrayEquals(new Integer[] {1, 1, 2, 3, 3, 3, 3}, lintCode434.numIslands2(test5n, test5m, test5p).toArray());
    assertArrayEquals(new Integer[] {1, 1, 1, 1, 2, 3, 3, 3, 3}, lintCode434.numIslands2(test6n, test6m, test6p).toArray());
  }
}