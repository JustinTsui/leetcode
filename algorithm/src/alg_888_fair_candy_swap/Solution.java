package alg_888_fair_candy_swap;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/fair-candy-swap/
 */
public class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0;
        int sumB = 0;

        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            sumA += a;
        }
        for (int b : B) {
            set.add(b);
            sumB += b;
        }

        int delta = (sumB - sumA) / 2;

        for (int a : A) {
            if (set.contains(a + delta)) {
                return new int[] {a, a + delta};
            }
        }
        return null;
    }
}
