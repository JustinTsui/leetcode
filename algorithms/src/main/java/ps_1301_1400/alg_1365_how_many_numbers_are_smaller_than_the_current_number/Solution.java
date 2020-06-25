package ps_1301_1400.alg_1365_how_many_numbers_are_smaller_than_the_current_number;

/**
 * https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 */
public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] index = new int[101];
        for (int i : nums) {
            index[i]++;
        }

        int count = 0;
        for (int i = 0; i < index.length; i++) {
            int swap = index[i];
            index[i] = count;
            count += swap;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = index[nums[i]];
        }
        return nums;
    }
}
