package ps_1601_1700.alg_1684_count_the_number_of_consistent_strings;

/**
 * https://leetcode.com/problems/count-the-number-of-consistent-strings
 */
public class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] map = new boolean[27];
        int result = 0;

        for (int i = 0; i < allowed.length(); i++) {
            char c = allowed.charAt(i);
            map[c - 'a'] = true;
        }

        for (String str : words) {
            boolean met = true;
            for (int i = 0; i < str.length(); i++) {
                if (!map[str.charAt(i) - 'a']) {
                    met = false;
                    break;
                }
            }
            if (met) {
                result++;
            }
        }

        return result;
    }
}
