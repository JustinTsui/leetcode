package ps_0001_0100.alg_015_3sum;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testcase1() {
        List<List<Integer>> actual = solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        assertEquals(2, actual.size());
    }

    @Test
    public void testcase2() {
        List<List<Integer>> actual = solution.threeSum(new int[]{0});
        assertEquals(0, actual.size());
    }

    @Test
    public void testcase3() {
        List<List<Integer>> actual = solution.threeSum(new int[]{});
        assertEquals(0, actual.size());
    }
}