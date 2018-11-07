package alg_883_projection_area_of_3d_shapes;

/**
 * https://leetcode.com/problems/projection-area-of-3d-shapes/
 */
public class Solution {
    public int projectionArea(int[][] grid) {
        int xAxes = 0;
        int yAxes = 0;
        int zAxes = 0;

        for (int i = 0; i < grid.length; i++) {
            int maxX = 0;
            int maxY = 0;
            for (int j = 0; j < grid.length; j++) {
                maxX = maxX > grid[j][i] ? maxX : grid[j][i];
                maxY = maxY > grid[i][j] ? maxY : grid[i][j];
                zAxes = grid[i][j] > 0 ? zAxes + 1 : zAxes;
            }
            xAxes += maxX;
            yAxes += maxY;
        }
        return xAxes + yAxes + zAxes;
    }
}
