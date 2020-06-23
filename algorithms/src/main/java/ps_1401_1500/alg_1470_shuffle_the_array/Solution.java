package ps_1401_1500.alg_1470_shuffle_the_array;

/**
 * This problem also can be done with in-array swap
 * but i think this solution is slightly faster
 *
 * https://leetcode.com/problems/shuffle-the-array/
 */
public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            result[index++] = nums[i];
            result[index++] = nums[i + n];
        }
        return result;
    }
}
