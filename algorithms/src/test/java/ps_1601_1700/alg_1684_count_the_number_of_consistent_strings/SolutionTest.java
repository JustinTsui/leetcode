package ps_1601_1700.alg_1684_count_the_number_of_consistent_strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testcase1() {
        assertEquals(2, solution.countConsistentStrings("ab", new String[]{"ad", "bd", "aaab", "baa", "badab"}));
    }

    @Test
    public void testcase2() {
        assertEquals(7, solution.countConsistentStrings("abc", new String[]{"a", "b", "c", "ab", "ac", "bc", "abc"}));
    }

    @Test
    public void testcase3() {
        assertEquals(4, solution.countConsistentStrings("cad",
                new String[]{"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"}));
    }
}