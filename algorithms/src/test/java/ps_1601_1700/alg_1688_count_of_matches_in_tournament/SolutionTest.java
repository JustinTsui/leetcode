package ps_1601_1700.alg_1688_count_of_matches_in_tournament;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testcase1() {
        assertEquals(6, solution.numberOfMatches(7));
    }

    @Test
    public void testcase2() {
        assertEquals(13, solution.numberOfMatches(14));
    }
}