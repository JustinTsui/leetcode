package ps_1301_1400.alg_1309_decrypt_string_from_alphabet_to_integer_mapping;

/**
 * https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
 */
public class Solution {
    public String freqAlphabets(String s) {
        int length = s.length();
        byte[] array = new byte[length];
        int i = 0;
        int offset = 0;
        int count = 0;
        while (i < length) {
            if (i + 2 < length && s.charAt(i + 2) == '#') {
                array[offset++] = (byte) ((s.charAt(i) - '0') * 10 + s.charAt(i + 1) + '0');
                i += 3;
            } else {
                array[offset++] = (byte) (s.charAt(i) + '0');
                i += 1;
            }
            count++;
        }
        return new String(array, 0, count);
    }
}
