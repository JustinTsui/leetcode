package ps_0001_0100.alg_011_container_with_most_water;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testcase1() {
        assertEquals(49, solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    public void testcase2() {
        assertEquals(1, solution.maxArea(new int[]{1, 1}));
    }

    @Test
    public void testcase3() {
        assertEquals(16, solution.maxArea(new int[]{4, 3, 2, 1, 4}));
    }

    @Test
    public void testcase4() {
        assertEquals(2, solution.maxArea(new int[]{1, 2, 1}));
    }
}