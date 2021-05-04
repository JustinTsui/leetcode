package ps_1701_1800.alg_1791_find_center_of_star_graph;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testcase1() {
        int[][] input = new int[][]{
                new int[]{1, 2},
                new int[]{2, 3},
                new int[]{4, 2}
        };
        assertEquals(2, solution.findCenter(input));
    }

    @Test
    public void testcase2() {
        int[][] input = new int[][]{
                new int[]{1, 2},
                new int[]{5, 1},
                new int[]{1, 3},
                new int[]{1, 4}
        };
        assertEquals(1, solution.findCenter(input));
    }
}