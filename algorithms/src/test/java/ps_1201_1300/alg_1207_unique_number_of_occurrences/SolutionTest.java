package ps_1201_1300.alg_1207_unique_number_of_occurrences;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testcase1() {
        int[] input = new int[]{1, 2, 2, 1, 1, 3};
        assertTrue(solution.uniqueOccurrences(input));
    }

    @Test
    public void testcase2() {
        int[] input = new int[]{1, 2};
        assertFalse(solution.uniqueOccurrences(input));
    }

    @Test
    public void testcase3() {
        int[] input = new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        assertTrue(solution.uniqueOccurrences(input));
    }
}