package ps_0901_1000.alg_905_sort_array_by_parity;

/**
 * https://leetcode.com/problems/sort-array-by-parity/
 */
public class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] evens = new int[A.length];
        int[] odds = new int[A.length];
        int[] result = new int[A.length];
        int evenCounter = 0;
        int oddCounter = 0;
        int resultCounter = 0;

        for (int i : A) {
            if (i % 2 == 1) {
                odds[oddCounter++] = i;
            } else {
                evens[evenCounter++] = i;
            }
        }


        for (int i = 0; i < evenCounter; i++) {
            result[resultCounter++] = evens[i];
        }
        for (int i = 0; i < oddCounter; i++) {
            result[resultCounter++] = odds[i];
        }
        return result;
    }
}
