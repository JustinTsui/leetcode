package ps_0901_1000.alg_942_di_string_match;

/**
 * https://leetcode.com/problems/di-string-match/
 */
public class Solution {
    public int[] diStringMatch(String S) {
        int length = S.length();
        int[] result = new int[length + 1];

        for (int i = 0; i < result.length; i++) {
            result[i] = i;
        }


        for (int i = 0; i < length; i++) {
            char c = S.charAt(i);
            if (c == 'D') {
                int end = i;
                while (end < length && S.charAt(end) == 'D') {
                    end++;
                }
                swap(result, i, end);
                i = end;
            }
        }
        return result;
    }

    private void swap(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
