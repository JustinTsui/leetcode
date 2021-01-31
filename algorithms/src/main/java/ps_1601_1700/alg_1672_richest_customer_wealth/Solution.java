package ps_1601_1700.alg_1672_richest_customer_wealth;

/**
 * https://leetcode.com/problems/richest-customer-wealth
 */
public class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for (int[] account : accounts) {
            int count = 0;
            for (int j : account) {
                count += j;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}
