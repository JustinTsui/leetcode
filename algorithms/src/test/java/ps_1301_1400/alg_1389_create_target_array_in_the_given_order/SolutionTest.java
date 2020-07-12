package ps_1301_1400.alg_1389_create_target_array_in_the_given_order;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testcase1() {
        int[] nums = new int[]{0, 1, 2, 3, 4};
        int[] index = new int[]{0, 1, 2, 2, 1};
        int[] output = new int[]{0, 4, 1, 3, 2};

        assertArrayEquals(output, solution.createTargetArray(nums, index));
    }

    @Test
    public void testcase2() {
        int[] nums = new int[]{1, 2, 3, 4, 0};
        int[] index = new int[]{0, 1, 2, 3, 0};
        int[] output = new int[]{0, 1, 2, 3, 4};

        assertArrayEquals(output, solution.createTargetArray(nums, index));
    }

    @Test
    public void testcase3() {
        int[] nums = new int[]{1};
        int[] index = new int[]{0};
        int[] output = new int[]{1};

        assertArrayEquals(output, solution.createTargetArray(nums, index));
    }

}