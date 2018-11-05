package _832.flipping.an.image;


/**
 * https://leetcode.com/problems/flipping-an-image/
 */
class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int size = A.length;
        int[][] result = new int[A.length][A.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                // result[i][j] = A[i][size - j - 1] == 0 ? 1 : 0;
                result[i][j] = A[i][size - j - 1] ^ 1;
            }
        }

        return result;
    }
}