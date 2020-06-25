package ps_1401_1500.alg_1486_xor_operation_in_an_array;

/**
 * https://leetcode.com/problems/xor-operation-in-an-array/
 */
public class Solution {
    public int xorOperation(int n, int start) {
        int i = 1;
        int result = start;
        while (--n > 0) {
            result ^= start + (2 * i++);
        }
        return result;
    }
}
