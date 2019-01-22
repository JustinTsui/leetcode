package alg_977_squares_of_a_sorted_array;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.sortedSquares(new int[]{-4, -1, 0, 3, 10});
        System.out.println(result);
    }

    public int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int val = A[i];
            result[i] = val * val;
        }
        Arrays.sort(result);
        return result;
    }
}
