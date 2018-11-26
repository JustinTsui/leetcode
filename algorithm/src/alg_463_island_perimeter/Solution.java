package alg_463_island_perimeter;

/**
 * https://leetcode.com/problems/island-perimeter/
 */
public class Solution {
    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        int result = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    result += 4;
                    // south
                    if (i + 1 < row && grid[i + 1][j] == 1) {
                        result -= 2;
                    }

                    // east
                    if (j + 1 < col && grid[i][j + 1] == 1) {
                        result -= 2;
                    }
                }
            }
        }
        return result;
    }
}
