package ps_0501_0600.alg_521_longest_uncommon_subsequence_i;

/**
 * https://leetcode.com/problems/longest-uncommon-subsequence-i/
 */
public class Solution {
    public int findLUSlength(String a, String b) {
        if (a.equals(b)) {
            return -1;
        }
        return Math.max(a.length(), b.length());
    }
}