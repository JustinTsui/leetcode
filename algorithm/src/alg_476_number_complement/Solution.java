package alg_476_number_complement;

/**
 * https://leetcode.com/problems/number-complement/
 */
public class Solution {
    public int findComplement(int num) {
        int positive = ~(1 << 31) & num;
        int power = 0;
        while (Math.pow(2, power) <= positive) {
            power++;
        }
        return positive ^ ~(~0 << power);
    }

}
