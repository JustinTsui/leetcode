package ps_1501_1600.alg_1512_number_of_good_pairs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testcase1() {
        int[] input = new int[]{1, 2, 3, 1, 1, 3};
        assertEquals(4, solution.numIdenticalPairs(input));
    }

    @Test
    public void testcase2() {
        int[] input = new int[]{1, 1, 1, 1};
        assertEquals(6, solution.numIdenticalPairs(input));
    }

    @Test
    public void testcase3() {
        int[] input = new int[]{1, 2, 3};
        assertEquals(0, solution.numIdenticalPairs(input));
    }
}