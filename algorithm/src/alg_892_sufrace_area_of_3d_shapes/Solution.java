package alg_892_sufrace_area_of_3d_shapes;

/**
 * https://leetcode.com/problems/surface-area-of-3d-shapes/
 */
public class Solution {
    public int surfaceArea(int[][] grid) {
        int sum = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    sum += grid[i][j] * 6;

                    sum -= (grid[i][j] - 1) * 2;

                    if (i < grid.length - 1) {
                        sum -= 2 * Math.min(grid[i + 1][j], grid[i][j]);
                    }

                    if (j < grid[0].length - 1) {
                        sum -= 2 * Math.min(grid[i][j + 1], grid[i][j]);
                    }
                }

            }
        }
        return sum;
    }
}
