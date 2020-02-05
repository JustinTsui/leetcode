package ps_1301_1400.alg_1304_find_n_unique_integers_sum_up_to_zero;

/**
 * https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
 */
public class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int index = 0;
        if ((n & 1) == 1) {
            result[index++] = 0;
            while (index < n) {
                result[index] = index;
                result[index + 1] = -index;
                index += 2;
            }
        } else {
            while (index < n) {
                result[index] = index + 1;
                result[index + 1] = -index - 1;
                index += 2;
            }
        }

        return result;
    }
}
