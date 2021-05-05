package ps_0001_0100.alg_011_container_with_most_water;

/**
 * https://leetcode.com/problems/container-with-most-water/
 */
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int area;
            if (height[i] > height[j]) {
                area = height[j] * (j - i);
                j--;
            } else {
                area = height[i] * (j - i);
                i++;
            }
            if (max < area) {
                max = area;
            }
        }
        return max;
    }
}