package ps_1301_1400.alg_1323_maximum_69_number;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testcase1() {
        assertEquals(9969, solution.maximum69Number(9669));
    }

    @Test
    public void testcase2() {
        assertEquals(9999, solution.maximum69Number(9996));
    }

    @Test
    public void testcase3() {
        assertEquals(9999, solution.maximum69Number(9999));
    }
}