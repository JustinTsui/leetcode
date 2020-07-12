package ps_1301_1400.alg_1389_create_target_array_in_the_given_order;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/create-target-array-in-the-given-order
 */
public class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] result = new int[nums.length];
        Arrays.fill(result, -1);
        for (int i = 0; i < nums.length; i++) {
            int idx = index[i];
            if (result[idx] != -1) {
                while (result[idx] != -1) {
                    idx++;
                }
                System.arraycopy(result, index[i], result, index[i] + 1, idx - index[i]);
            }
            result[index[i]] = nums[i];
        }
        return result;
    }
}
