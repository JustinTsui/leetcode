package ps_0701_0800.alg_766_toeplitz_matrix;

/**
 * https://leetcode.com/problems/toeplitz-matrix/
 */
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        if (row == 1 || col == 1) {
            return true;
        }

        // row 0 iteration
        for (int i = 0; i < col; i++) {
            int value = matrix[0][i];
            int rowIndex = 0;
            if (!isToeplitz(matrix, row, col, value, rowIndex, i)) {
                return false;
            }

        }

        // column 0 iteration
        for (int i = 1; i < row; i++) {
            int value = matrix[i][0];
            int colIndex = 0;
            if (!isToeplitz(matrix, row, col, value, i, colIndex)) {
                return false;
            }
        }

        return true;
    }

    private boolean isToeplitz(int[][] matrix, int row, int col, int value, int rowIndex, int colIndex) {
        while (rowIndex < row && colIndex < col) {
            if (matrix[rowIndex][colIndex] != value) {
                return false;
            }
            rowIndex++;
            colIndex++;
        }
        return true;
    }
}