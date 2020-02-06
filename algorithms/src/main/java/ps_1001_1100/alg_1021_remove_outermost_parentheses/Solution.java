package ps_1001_1100.alg_1021_remove_outermost_parentheses;

/**
 * https://leetcode.com/problems/remove-outermost-parentheses/
 */
public class Solution {
    public String removeOuterParentheses(String S) {
        StringBuilder stringBuilder = new StringBuilder();

        int count = 0;
        for (char ch : S.toCharArray()) {
            if (ch == '(') {
                if (count != 0) {
                    stringBuilder.append(ch);
                }
                count++;
            } else {
                count--;
                if (count != 0) {
                    stringBuilder.append(ch);
                }
            }

        }

        return stringBuilder.toString();
    }
}
