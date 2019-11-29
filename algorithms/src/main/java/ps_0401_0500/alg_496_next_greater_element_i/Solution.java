package ps_0401_0500.alg_496_next_greater_element_i;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/next-greater-element-i/
 */
public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> position = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            position.put(nums2[i], i);
        }

        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int n = nums1[i];
            result[i] = nextGreater(nums2, position.get(n), n);
        }

        return result;
    }

    private int nextGreater(int[] nums, int index, int value) {
        for (int i = index; i < nums.length; i++) {
            if (nums[i] > value) {
                return nums[i];
            }
        }
        return -1;
    }
}
