package ps_1601_1700.alg_1678_goal_parser_interpretation;

/**
 * https://leetcode.com/problems/goal-parser-interpretation
 */
public class Solution {
    public String interpret2(String command) {
        return command.replaceAll("\\(al\\)", "al").replaceAll("\\(\\)", "o");
    }

    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            char c = command.charAt(i);
            if (c == 'G') {
                sb.append(c);
            } else if (command.charAt(++i) == ')') {
                sb.append('o');
            } else {
                sb.append("al");
                i += 2;
            }
        }
        return sb.toString();
    }
}
