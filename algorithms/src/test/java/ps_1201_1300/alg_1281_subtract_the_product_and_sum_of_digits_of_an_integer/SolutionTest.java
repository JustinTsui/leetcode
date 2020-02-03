package ps_1201_1300.alg_1281_subtract_the_product_and_sum_of_digits_of_an_integer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testcase1() {
        assertEquals(15, solution.subtractProductAndSum(234));
    }

    @Test
    public void testcase2() {
        assertEquals(21, solution.subtractProductAndSum(4421));
    }
}