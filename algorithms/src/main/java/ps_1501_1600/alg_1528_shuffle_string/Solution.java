package ps_1501_1600.alg_1528_shuffle_string;

/**
 * https://leetcode.com/problems/shuffle-string
 */
public class Solution {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }
}
