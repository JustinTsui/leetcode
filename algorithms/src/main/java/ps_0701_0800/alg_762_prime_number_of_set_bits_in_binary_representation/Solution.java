package ps_0701_0800.alg_762_prime_number_of_set_bits_in_binary_representation;

/**
 * https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/
 */
public class Solution {

    public int countPrimeSetBits(int L, int R) {
        int result = 0;
        for (int i = L; i <= R; i++) {
            int bit1Count = 0;
            int value = i;
            while (value > 0) {
                if ((value & 1) == 1) {
                    bit1Count++;
                }
                value = value >> 1;
            }

            if (isPrime(bit1Count)) {
                result++;
            }
        }
        return result;
    }

    /**
     * L, R's range is [1, 10^6], 2^20 (1048576) is larger than 10^6
     * so the largest number can be represented in 20 digits.
     * In another word, digits contains 1 cannot be over 20.
     */
    private boolean isPrime(int n) {
        return n == 2 || n == 3 || n == 5 || n == 7 || n == 11 || n == 13 || n == 17 || n == 19;
    }
}
