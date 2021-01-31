package ps_1501_1600.alg_1512_number_of_good_pairs;

/**
 * https://leetcode.com/problems/number-of-good-pairs
 */
public class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int j = nums.length - 1; j >= 1; j--) {
            for (int i = 0; i < j; i++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
