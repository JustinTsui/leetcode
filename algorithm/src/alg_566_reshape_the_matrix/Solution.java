package alg_566_reshape_the_matrix;

/**
 * https://leetcode.com/problems/reshape-the-matrix/
 */
class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int rowCount = nums.length;
        int colCount = nums[0].length;
        if (r * c != rowCount * colCount) {
            return nums;
        }

        int[][] result = new int[r][c];
        int rowIndex = 0;
        int colIndex = 0;

        for (int[] num : nums) {
            for (int j = 0; j < colCount; j++) {
                result[rowIndex][colIndex++] = num[j];
                if (colIndex >= c) {
                    colIndex = 0;
                    rowIndex++;
                }
            }
        }
        return result;
    }
}