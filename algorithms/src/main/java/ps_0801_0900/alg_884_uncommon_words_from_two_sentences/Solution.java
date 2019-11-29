package ps_0801_0900.alg_884_uncommon_words_from_two_sentences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/uncommon-words-from-two-sentences/
 */
public class Solution {

    public String[] uncommonFromSentences(String A, String B) {
        String[] splitA = A.split(" ");
        String[] splitB = B.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String word : splitA) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (String word : splitB) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }

        return result.toArray(new String[0]);
    }

}
