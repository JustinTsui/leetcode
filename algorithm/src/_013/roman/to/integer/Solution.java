package _013.roman.to.integer;

/**
 * https://leetcode.com/problems/roman-to-integer/description/
 */
class Solution {

    enum RomanNumber {
        I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

        RomanNumber(int decimal) {
            this.decimal = decimal;
        }

        private int decimal;

        public boolean isBigger(RomanNumber num) {
            return this.decimal > num.decimal;
        }
    }

    public int romanToInt(String s) {
        int result = 0;

        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            RomanNumber num = RomanNumber.valueOf("" + chars[i]);
            boolean isBigger = false;

            if (i < s.length() - 1) {
                RomanNumber next = RomanNumber.valueOf("" + chars[i + 1]);
                isBigger = next.isBigger(num);
            }

            result = isBigger ? result - num.decimal : result + num.decimal;
        }

        return result;
    }
}