package ps_0901_1000.alg_976_largest_perimeter_triangle;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/largest-perimeter-triangle/
 */
public class Solution {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 2; i--) {
            if (A[i] < A[i - 1] + A[i - 2]) {
                return A[i] + A[i - 1] + A[i - 2];
            }
        }
        return 0;
    }
}
