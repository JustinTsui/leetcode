package ps_1301_1400.alg_1365_how_many_numbers_are_smaller_than_the_current_number;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testcase1() {
        int[] input = new int[]{8, 1, 2, 2, 3};
        int[] output = new int[]{4, 0, 1, 1, 3};
        assertArrayEquals(output, solution.smallerNumbersThanCurrent(input));
    }

    @Test
    public void testcase2() {
        int[] input = new int[]{6, 5, 4, 8};
        int[] output = new int[]{2, 1, 0, 3};
        assertArrayEquals(output, solution.smallerNumbersThanCurrent(input));
    }

    @Test
    public void testcase3() {
        int[] input = new int[]{7, 7, 7, 7};
        int[] output = new int[]{0, 0, 0, 0};
        assertArrayEquals(output, solution.smallerNumbersThanCurrent(input));
    }

    @Test
    public void testcase4() {
        int[] input = new int[]{5, 0, 10, 0, 10, 6};
        int[] output = new int[]{2, 0, 4, 0, 4, 3};
        assertArrayEquals(output, solution.smallerNumbersThanCurrent(input));
    }
}