package ps_1101_1200.alg_1252_cells_with_odd_values_in_a_matrix;

public class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int[][] matrix = new int[n][m];
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
        int result = 0;
        for (int[] index : matrix) {
            for (int i : index) {
                if ((i & 1) != 0) {
                    result++;
                }
            }
        }
        return result;
    }
}
