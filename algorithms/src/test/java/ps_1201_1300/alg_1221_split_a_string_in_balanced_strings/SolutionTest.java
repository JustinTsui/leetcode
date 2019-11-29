package ps_1201_1300.alg_1221_split_a_string_in_balanced_strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testRLRRLLRLRL() {
        assertEquals(4, solution.balancedStringSplit("RLRRLLRLRL"));
    }

    @Test
    public void testRLLLLRRRLR() {
        assertEquals(3, solution.balancedStringSplit("RLLLLRRRLR"));
    }

    @Test
    public void testLLLLRRRR() {
        assertEquals(1, solution.balancedStringSplit("LLLLRRRR"));
    }

    @Test
    public void testRLRRRLLRLL() {
        assertEquals(2, solution.balancedStringSplit("RLRRRLLRLL"));
    }

}