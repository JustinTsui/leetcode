package ps_1401_1500.alg_1470_shuffle_the_array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testcase1() {
        int[] nums = new int[]{2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] output = new int[]{2, 3, 5, 4, 1, 7};
        assertArrayEquals(output, solution.shuffle(nums, n));
    }

    @Test
    public void testcase2() {
        int[] nums = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
        int n = 4;
        int[] output = new int[]{1, 4, 2, 3, 3, 2, 4, 1};
        assertArrayEquals(output, solution.shuffle(nums, n));
    }

    @Test
    public void testcase3() {
        int[] nums = new int[]{1, 1, 2, 2};
        int n = 2;
        int[] output = new int[]{1, 2, 1, 2};
        assertArrayEquals(output, solution.shuffle(nums, n));
    }
}