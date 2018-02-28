package _003.longest.substring.without.repeating.characters;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Set<Character> set = new HashSet<Character>();

        int length = s.length();
        int i = 0;
        int j = 0;
        int result = 0;
        while (i < length && j < length) {
            if (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;
            } else {
                set.add(s.charAt(j));
                j++;
                result = Math.max(result, j - i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.lengthOfLongestSubstring("abca"));
    }
}
