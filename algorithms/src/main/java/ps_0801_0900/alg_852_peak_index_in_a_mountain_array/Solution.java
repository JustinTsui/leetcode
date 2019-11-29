package ps_0801_0900.alg_852_peak_index_in_a_mountain_array;

/**
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/
 */
class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int index = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
                index = i;
            }
        }
        return index;
    }
}