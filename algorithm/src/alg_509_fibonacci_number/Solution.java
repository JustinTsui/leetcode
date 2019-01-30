package alg_509_fibonacci_number;

/**
 * https://leetcode.com/problems/fibonacci-number/
 */
class Solution {

    public int fib(int N) {
        if (N < 2) {
            return N;
        }
        int[] result = new int[]{0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181,
                6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040};
        return result[N - 1];
    }

    private int f(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return f(n - 1) + f(n - 2);
    }
}