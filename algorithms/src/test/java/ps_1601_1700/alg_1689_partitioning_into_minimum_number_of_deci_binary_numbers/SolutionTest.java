package ps_1601_1700.alg_1689_partitioning_into_minimum_number_of_deci_binary_numbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testcase1() {
        assertEquals(3, solution.minPartitions("32"));
    }

    @Test
    public void testcase2() {
        assertEquals(8, solution.minPartitions("82734"));
    }

    @Test
    public void testcase3() {
        assertEquals(9, solution.minPartitions("27346209830709182346"));
    }
}