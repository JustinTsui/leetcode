package alg_908_smallest_range_i;

/**
 * https://leetcode.com/problems/smallest-range-i/
 */
class Solution {
    public int smallestRangeI(int[] A, int K) {
        int max = A[0];
        int min = A[0];
        for (int a : A) {
            if (a > max) {
                max = a;
            }
            if (a < min) {
                min = a;
            }
        }
        if (max - min < K + K) {
            return 0;
        } else {
            return max - min - K - K;
        }
    }
}