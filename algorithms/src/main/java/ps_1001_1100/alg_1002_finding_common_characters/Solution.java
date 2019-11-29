package ps_1001_1100.alg_1002_finding_common_characters;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-common-characters/
 */
class Solution {
    public List<String> commonChars(String[] A) {
        int[] counts = new int[26];
        Arrays.fill(counts, Integer.MAX_VALUE);

        for (String s : A) {
            int[] word = new int[26];
            for (char ch : s.toCharArray()) {
                word[ch - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                counts[i] = Math.min(word[i], counts[i]);
            }
        }

        List<String> result = new LinkedList<>();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                for (int j = 0; j < counts[i]; j++) {
                    result.add("" + (char) ('a' + i));
                }
            }
        }

        return result;
    }
}