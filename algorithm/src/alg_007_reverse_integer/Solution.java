package alg_007_reverse_integer;

/**
 * https://leetcode.com/problems/reverse-integer/description/
 */
class Solution {
    public int reverse(int x) {
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
}