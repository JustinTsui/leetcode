package ps_0801_0900.alg_807_max_increase_to_keep_city_skyline;

/**
 * https://leetcode.com/problems/max-increase-to-keep-city-skyline
 */
public class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] rol = new int[grid[0].length];
        int[] col = new int[grid.length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                rol[i] = Math.max(grid[i][j], rol[i]);
                col[j] = Math.max(grid[i][j], col[j]);
            }
        }
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                result += rol[i] < col[j] ? rol[i] - grid[i][j] : col[j] - grid[i][j];
            }
        }
        return result;
    }
}
