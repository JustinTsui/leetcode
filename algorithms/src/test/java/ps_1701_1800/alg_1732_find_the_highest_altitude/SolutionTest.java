package ps_1701_1800.alg_1732_find_the_highest_altitude;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testcase1() {
        assertEquals(1, solution.largestAltitude(new int[]{-5, 1, 5, 0, -7}));
    }

    @Test
    public void testcase2() {
        assertEquals(0, solution.largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2}));
    }

}