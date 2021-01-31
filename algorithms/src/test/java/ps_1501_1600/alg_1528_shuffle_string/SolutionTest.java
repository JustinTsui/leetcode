package ps_1501_1600.alg_1528_shuffle_string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testcase1() {
        assertEquals("leetcode", solution.restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
    }

    @Test
    public void testcase2() {
        assertEquals("abc", solution.restoreString("abc", new int[]{0, 1, 2}));
    }

    @Test
    public void testcase3() {
        assertEquals("nihao", solution.restoreString("aiohn", new int[]{3, 1, 4, 2, 0}));
    }

    @Test
    public void testcase4() {
        assertEquals("arigatou", solution.restoreString("aaiougrt", new int[]{4, 0, 2, 6, 7, 3, 1, 5}));
    }

    @Test
    public void testcase5() {
        assertEquals("rat", solution.restoreString("art", new int[]{1, 0, 2}));
    }
}