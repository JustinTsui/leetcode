package ps_0801_0900.alg_867_transpose_matrix;

/**
 * https://leetcode.com/problems/transpose-matrix/
 */
class Solution {
    public int[][] transpose(int[][] A) {
        int[][] result = new int[A[0].length][A.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                result[j][i] = A[i][j];
            }
        }
        return result;
    }
}