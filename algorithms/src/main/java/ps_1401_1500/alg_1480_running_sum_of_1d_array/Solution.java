package ps_1401_1500.alg_1480_running_sum_of_1d_array;

/**
 * https://leetcode.com/problems/running-sum-of-1d-array/
 */
class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }

        return result;
    }
}
