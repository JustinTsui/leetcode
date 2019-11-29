package ps_0701_0800.alg_728_self_dividing_numbers;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/self-dividing-numbers/
 */
public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean isSelfDividing(int number) {
        int copy = number;
        while (copy != 0) {
            int mod = copy % 10;
            if (mod == 0 || number % mod != 0) {
                return false;
            }
            copy /= 10;
        }
        return true;
    }
}
