package ps_0701_0800.alg_784_letter_case_permutation;

import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/letter-case-permutation/
 */
public class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> result = new LinkedList<>();
        recursive(result, "", S, 0);
        return result;
    }

    private void recursive(List<String> list, String cur, String s, int index) {
        if (cur.length() == s.length()) {
            list.add(cur);
            return;
        }

        char ch = s.charAt(index);
        if (ch > '9') {
            recursive(list,cur + Character.toUpperCase(ch), s, index + 1);
            recursive(list,cur + Character.toLowerCase(ch), s, index + 1);
        } else {
            recursive(list, cur + ch, s, index + 1);
        }
    }
}
