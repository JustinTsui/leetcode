package ps_0801_0900.alg_807_max_increase_to_keep_city_skyline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testcase1() {
        int[][] grid = new int[][]{new int[]{3, 0, 8, 4}, new int[]{2, 4, 5, 7}, new int[]{9, 2, 6, 3}, new int[]{0, 3, 1, 0}};
        assertEquals(35, solution.maxIncreaseKeepingSkyline(grid));
    }

}