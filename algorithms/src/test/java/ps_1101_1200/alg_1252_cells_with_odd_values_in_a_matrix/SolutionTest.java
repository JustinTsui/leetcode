package ps_1101_1200.alg_1252_cells_with_odd_values_in_a_matrix;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testcase1() {
        int[][] input = new int[][]{new int[]{0, 1}, new int[]{1, 1}};
        assertEquals(6, solution.oddCells(2, 3, input));
    }

    @Test
    public void testcase2() {
        int[][] input = new int[][]{new int[]{1, 1}, new int[]{0, 0}};
        assertEquals(0, solution.oddCells(2, 2, input));
    }
}