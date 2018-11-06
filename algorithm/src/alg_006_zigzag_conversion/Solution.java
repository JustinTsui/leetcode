package alg_006_zigzag_conversion;

/**
 * https://leetcode.com/problems/zigzag-conversion/description/
 */
class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] builders = new StringBuilder[numRows];
        for (int i = 0; i < builders.length; i++) {
          builders[i] = new StringBuilder();

        }

        char[] charArray = s.toCharArray();
        int col = 0;
        int direction = 1;
        for (char ch : charArray) {
            builders[col].append(ch);

            if (col == numRows - 1) {
                direction = -1;
            }
            if (col == 0) {
                direction = 1;
            }
            col += direction;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder builder : builders) {
            result.append(builder.toString());
        }
        return result.toString();
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.convert("paypalishiring", 3));
    }

}