package ps_0001_0100.alg_026_remove_duplicates_from_sorted_array;

/**
 * https://leetcode.com/problems/3sum/
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int cur = nums[0];
        int index = 1;
        int result = 1;
        for (int i = 1; i < nums.length; i++) {
            if (cur == nums[i]) {
                continue;
            }
            result++;
            nums[index++] = nums[i];
            cur = nums[i];
        }
        return result;
    }
}