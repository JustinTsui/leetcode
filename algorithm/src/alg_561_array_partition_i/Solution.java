package alg_561_array_partition_i;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/array-partition-i/
 */
public class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        int count = 1;
        while (count <= nums.length) {
            result += nums[count - 1];
            count += 2;
        }
        return result;
    }
}
