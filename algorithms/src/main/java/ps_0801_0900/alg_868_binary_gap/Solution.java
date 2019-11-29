package ps_0801_0900.alg_868_binary_gap;

/**
 * https://leetcode.com/problems/binary-gap/
 */
public class Solution {
    public int binaryGap(int N) {
        int length = -1;
        int result = 0;
        for (int i = 0; i < 32; ++i) {
            if (((N >> i) & 1) > 0) {
                if (length >= 0) {
                    result = Math.max(result, i - length);
                }
                length = i;
            }
        }
        return result;
    }
}
