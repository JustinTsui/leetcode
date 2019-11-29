package ps_0901_1000.alg_985_sum_of_even_numbers_after_queries;

/**
 * https://leetcode.com/problems/sum-of-even-numbers-after-queries/
 */
public class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] result = new int[queries.length];
        int value = 0;
        for (int a : A) {
            if (isEven(a)) {
                value += a;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int delta = queries[i][0];
            int index = queries[i][1];

            if (isEven(A[index])) {
                if (isEven(delta)) {
                    value += delta;
                } else {
                    value -= A[index];
                }
            } else {
                if (!isEven(delta)) {
                    value += A[index] + delta;
                }
            }

            A[index] += delta;
            result[i] = value;
        }

        return result;
    }

    private boolean isEven(int value) {
        return (value & 1) == 0;
    }
}
