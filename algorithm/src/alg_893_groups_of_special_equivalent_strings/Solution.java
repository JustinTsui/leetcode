package alg_893_groups_of_special_equivalent_strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/groups-of-special-equivalent-strings/
 */
class Solution {
    public int numSpecialEquivGroups(String[] A) {
        Set<String> set = new HashSet<>();
        for (String s : A) {
            int length = s.length();
            char[] a = new char[length - length / 2];
            char[] b = new char[length / 2];
            for (int i = 0; i < length; i++) {
                if (i % 2 == 0) {
                    a[i / 2] = s.charAt(i);
                } else {
                    b[i / 2] = s.charAt(i);
                }
            }
            Arrays.sort(a);
            Arrays.sort(b);
            String result = new String(a) + new String(b);
            set.add(result);
        }
        return set.size();
    }
}