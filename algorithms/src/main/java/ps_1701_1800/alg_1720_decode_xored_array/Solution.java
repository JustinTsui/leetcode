package ps_1701_1800.alg_1720_decode_xored_array;

/**
 * https://leetcode.com/problems/decode-xored-array
 */
public class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] result = new int[encoded.length + 1];
        result[0] = first;
        for (int i = 1; i <= encoded.length; i++) {
            result[i] = result[i - 1] ^ encoded[i - 1];
        }
        return result;
    }
}
