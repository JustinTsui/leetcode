package alg_009_palindrome_number;

/**
 * https://leetcode.com/problems/palindrome-number/description/
 */
class Solution {

    private int reverse(int x) {
        Long result = 0L;
        while (x != 0) {
            result = result * 10 + x % 10;
            if (result >= Integer.MAX_VALUE) {
                return 0;
            }
            if (result <= Integer.MIN_VALUE) {
                return 0;
            }
            x = x / 10;
        }
        return result.intValue();
    }

    public boolean isPalindrome(int x) {
        return x >= 0 && reverse(x) == x;
    }
}