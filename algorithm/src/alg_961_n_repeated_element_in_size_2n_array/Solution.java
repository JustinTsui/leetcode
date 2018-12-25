package alg_961_n_repeated_element_in_size_2n_array;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 */
public class Solution {
    public int repeatedNTimes(int[] A) {
        int maxValue = 0;
        int maxCount = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : A) {
            int count = map.getOrDefault(i, 0) + 1;
            map.put(i, count);

            if (count > maxCount) {
                maxCount = count;
                maxValue = i;
            }
        }
        return maxValue;
    }
}
