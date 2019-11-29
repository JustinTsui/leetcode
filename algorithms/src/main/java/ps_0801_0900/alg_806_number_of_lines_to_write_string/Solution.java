package ps_0801_0900.alg_806_number_of_lines_to_write_string;

/**
 * https://leetcode.com/problems/number-of-lines-to-write-string/
 */
public class Solution {
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
