package alg_008_string_to_integer;

/**
 * https://leetcode.com/problems/string-to-integer-atoi/description/
 */
class Solution {
    public int myAtoi(String str) {
        if (str == null) {
            return 0;
        }
        str = str.trim();
        if ("".equals(str)) {
            return 0;
        }
        long result = 0;
        Integer sign = null;

        for (char c : str.toCharArray()) {
            if (sign == null  && c == '-') {
                sign = -1;
                continue;
            }
            if (sign == null && c == '+')  {
                sign = 1;
                continue;
            }

            if (c >= '0' && c <= '9') {
                result = result * 10 + (c - 48);
            } else {
                break;
            }

            if ((sign == null || sign == 1) && result >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (sign != null && sign == -1 && sign * result <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        if (sign == null) {
            sign = 1;
        }

        return (int) (sign * result);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.myAtoi("-2147483647"));
    }
}