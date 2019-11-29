package ps_0801_0900.alg_821_shortest_distance_to_a_character;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/shortest-distance-to-a-character/
 */
class Solution {
    public int[] shortestToChar(String S, char C) {
        char[] chars = S.toCharArray();
        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch == C) {
                indexes.add(i);
            }
        }

        int[] result = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            if (indexes.contains(i)) {
                result[i] = 0;
                continue;
            }

            int left = findLeft(indexes, i);
            int right = findRight(indexes, i);
            result[i] = Math.min(Math.abs(left - i), Math.abs(right - i));
        }

        return result;
    }

    private int findLeft(List<Integer> list, int index) {
        int i = 0;
        if (list.get(i) < index) {
            while (i < list.size() - 1 && list.get(i) < index) {
                i++;
            }
        }
        return list.get(i);
    }

    private int findRight(List<Integer> list, int index) {
        int i = list.size() - 1;
        if (list.get(i) > index) {
            while (list.get(i) > index && i > 0) {
                i--;
            }
        }
        return list.get(i);
    }
}
