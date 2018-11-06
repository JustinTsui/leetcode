package alg_922_sort_array_by_parity_ii;

/**
 * https://leetcode.com/problems/sort-array-by-parity-ii/
 */
class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int even = 0;
        int odd = 1;
        int[] result = new int[A.length];
        for (int a : A) {
            if (a % 2 == 0) {
                result[even] = a;
                even += 2;
            } else {
                result[odd] = a;
                odd += 2;
            }
        }
        return result;
    }
}