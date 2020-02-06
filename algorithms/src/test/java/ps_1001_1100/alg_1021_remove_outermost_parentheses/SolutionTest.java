package ps_1001_1100.alg_1021_remove_outermost_parentheses;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testcase1() {
        String input = "(()())(())";
        assertEquals("()()()", solution.removeOuterParentheses(input));
    }

    @Test
    public void testcase2() {
        String input = "(()())(())(()(()))";
        assertEquals("()()()()(())", solution.removeOuterParentheses(input));
    }

    @Test
    public void testcase3() {
        String input = "()()";
        assertEquals("", solution.removeOuterParentheses(input));
    }
}