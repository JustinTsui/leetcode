package ps_1401_1500.alg_1486_xor_operation_in_an_array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testcase1() {
        assertEquals(8, solution.xorOperation(5, 0));
    }

    @Test
    public void testcase2() {
        assertEquals(8, solution.xorOperation(4, 3));
    }

    @Test
    public void testcase3() {
        assertEquals(7, solution.xorOperation(1, 7));
    }

    @Test
    public void testcase4() {
        assertEquals(2, solution.xorOperation(10, 5));
    }
}