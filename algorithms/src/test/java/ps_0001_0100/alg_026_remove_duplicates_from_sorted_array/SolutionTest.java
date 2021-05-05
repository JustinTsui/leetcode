package ps_0001_0100.alg_026_remove_duplicates_from_sorted_array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testcase1() {
        assertEquals(2, solution.removeDuplicates(new int[]{1, 1, 2}));
    }

    @Test
    public void testcase2() {
        assertEquals(5, solution.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    @Test
    public void testcase3() {
        assertEquals(1, solution.removeDuplicates(new int[]{1, 1}));
    }

}