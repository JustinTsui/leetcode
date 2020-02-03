package ps_1201_1300.alg_1295_find_numbers_with_even_number_of_digits;

/**
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 */
class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        for (int i : nums) {
            int length = String.valueOf(i).length();
            if (length % 2 == 0) {
                result++;
            }
        }

        return result;
    }
}