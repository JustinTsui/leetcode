package ps_1401_1500.alg_1480_running_sum_of_1d_array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testcase1() {
        int[] input = new int[]{1, 2, 3, 4};
        int[] output = new int[]{1, 3, 6, 10};
        assertArrayEquals(output, solution.runningSum(input));
    }

    @Test
    public void testcase2() {
        int[] input = new int[]{1, 1, 1, 1, 1};
        int[] output = new int[]{1, 2, 3, 4, 5};
        assertArrayEquals(output, solution.runningSum(input));
    }

    @Test
    public void testcase3() {
        int[] input = new int[]{3, 1, 2, 10, 1};
        int[] output = new int[]{3, 4, 6, 16, 17};
        assertArrayEquals(output, solution.runningSum(input));
    }
}