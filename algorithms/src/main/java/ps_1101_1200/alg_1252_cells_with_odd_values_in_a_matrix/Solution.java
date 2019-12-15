package ps_1101_1200.alg_1252_cells_with_odd_values_in_a_matrix;

public class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int[][] matrix = new int[n][m];
        inc(indices, matrix);
        return countOdd(matrix);
    }

    private void inc(int[][] indices, int[][] matrix) {
        for (int[] ints : indices) {
            int row = ints[0];
            int col = ints[1];
            for (int i = 0; i < matrix[0].length;i++) {
                matrix[row][i]++;
            }

            for (int i = 0; i< matrix.length;i++) {
                matrix[i][col]++;
            }
        }
    }

    private int countOdd(int[][] indices) {
        int result = 0;
        for (int[] index : indices) {
            for (int i : index) {
                if (isOdd(i)) {
                    result++;
                }
            }
        }
        return result;
    }

    private boolean isOdd(int i) {
        return (i & 1) != 0;
    }
}
