package ps_1601_1700.alg_1662_check_if_two_string_arrays_are_equivalent;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testcase1() {
        assertTrue(solution.arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));
    }

    @Test
    public void testcase2() {
        assertFalse(solution.arrayStringsAreEqual(new String[]{"a", "cb"}, new String[]{"ab", "c"}));
    }

    @Test
    public void testcase3() {
        assertTrue(solution.arrayStringsAreEqual(new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"}));
    }
}