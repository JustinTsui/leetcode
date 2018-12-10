package alg_136_single_number;

/**
 * https://leetcode.com/problems/single-number/
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i : nums) {
            result ^= i;
        }
        return result;
    }
}
