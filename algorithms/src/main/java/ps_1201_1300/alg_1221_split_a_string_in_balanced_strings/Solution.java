package ps_1201_1300.alg_1221_split_a_string_in_balanced_strings;

/**
 * https://leetcode.com/problems/split-a-string-in-balanced-strings/
 */
public class Solution {
    public int balancedStringSplit(String s) {
        int result = 0;
        int sum = 0;
        for (char ch : s.toCharArray()) {
            sum = ch == 'R' ? sum - 1 : sum + 1;

            if (sum == 0) {
                result++;
            }
        }
        return result;
    }
}
