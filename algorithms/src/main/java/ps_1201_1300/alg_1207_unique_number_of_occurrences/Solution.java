package ps_1201_1300.alg_1207_unique_number_of_occurrences;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/unique-number-of-occurrences/
 */
public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(arr);

        int i = 0;
        int count = 1;
        while (i < arr.length) {
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                count++;
                i++;
            }
            if (set.contains(count)) {
                return false;
            }
            set.add(count);
            count = 1;
            i++;
        }
        return true;
    }
}
