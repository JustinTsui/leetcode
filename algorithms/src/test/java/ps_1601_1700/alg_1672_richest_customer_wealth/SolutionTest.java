package ps_1601_1700.alg_1672_richest_customer_wealth;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testcase1() {
        int[][] a = {new int[]{1, 2, 3}, new int[]{3, 2, 1}};
        assertEquals(6, solution.maximumWealth(a));
    }

    @Test
    public void testcase2() {
        int[][] a = {new int[]{1, 5}, new int[]{7, 3}, new int[]{3, 5}};
        assertEquals(10, solution.maximumWealth(a));
    }

    @Test
    public void testcase3() {
        int[][] a = {new int[]{2, 8, 7}, new int[]{7, 1, 3}, new int[]{1, 9, 5}};
        assertEquals(17, solution.maximumWealth(a));
    }
}