package ps_0001_0100.alg_027_remove_element;

/**
 * https://leetcode.com/problems/3sum/
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int index = nums.length;
        while (i < index) {
            if (nums[i] == val) {
                nums[i] = nums[index - 1];
                index--;
            } else {
                i++;
            }
        }
        return index;
    }
}