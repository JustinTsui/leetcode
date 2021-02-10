package ps_1601_1700.alg_1662_check_if_two_string_arrays_are_equivalent;

/**
 * https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent
 */
public class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = String.join("", word1);
        String s2 = String.join("", word2);
        return s1.equals(s2);
    }
}
