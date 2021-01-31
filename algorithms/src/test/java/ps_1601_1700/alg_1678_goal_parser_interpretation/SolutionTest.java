package ps_1601_1700.alg_1678_goal_parser_interpretation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testcase1() {
        assertEquals("Goal", solution.interpret("G()(al)"));
    }

    @Test
    public void testcase2() {
        assertEquals("Gooooal", solution.interpret("G()()()()(al)"));
    }

    @Test
    public void testcase3() {
        assertEquals("alGalooG", solution.interpret("(al)G(al)()()G"));
    }
}