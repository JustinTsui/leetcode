package alg_806_number_of_lines_to_write_stirng;

/**
 * https://leetcode.com/problems/number-of-lines-to-write-string/
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] widths = new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        String s = "abcdefghijklmnopqrstuvwxyz";

        int[] result = solution.numberOfLines(widths, s);
        System.out.println(result[0] + " " + result[1]);

        widths =  new int[]{4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        s = "bbbcccdddaaa";
        result = solution.numberOfLines(widths, s);
        System.out.println(result[0] + " " + result[1]);
    }

    public int[] numberOfLines(int[] widths, String S) {
        int lineCount = 1;
        int columnCount = 0;
        int limit = 100;

        for (char ch : S.toCharArray()) {
            int count = widths[ch - 'a'];
            if (columnCount + count > limit) {
                lineCount++;
                columnCount = count;
            } else {
                columnCount += count;
            }
        }

        return new int[]{lineCount, columnCount};
    }
}
