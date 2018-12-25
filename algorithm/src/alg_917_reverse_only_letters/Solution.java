package alg_917_reverse_only_letters;

/**
 * https://leetcode.com/problems/reverse-only-letters/
 */
public class Solution {
    public String reverseOnlyLetters(String S) {
        int left = 0;
        int right = S.length() - 1;
        char[] chs = S.toCharArray();

        while (left < right) {
            if (!Character.isLetter(chs[left])) {
                left++;
                continue;
            }
            if (!Character.isLetter(chs[right])) {
                right--;
                continue;
            }

            char tmp = chs[left];
            chs[left] = chs[right];
            chs[right] = tmp;
            left++;
            right--;
        }
        return new String(chs);
    }
}
