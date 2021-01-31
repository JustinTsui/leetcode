package ps_1601_1700.alg_1689_partitioning_into_minimum_number_of_deci_binary_numbers;

/**
 * https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers
 */
public class Solution {
    public int minPartitions(String n) {
        int result = -1;
        for (char ch : n.toCharArray()) {
            if (ch - '0' > result) {
                result = ch - '0';
            }
            if (result == 9) {
                // cut the rest numbers
                return result;
            }
        }
        return result;
    }
}
