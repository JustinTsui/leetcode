package ps_1201_1300.alg_1295_find_numbers_with_even_number_of_digits;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testcase1() {
        int[] input = new int[]{12, 345, 2, 6, 7896};
        assertEquals(2, solution.findNumbers(input));
    }

    @Test
    public void testcase2() {
        int[] input = new int[]{555, 901, 482, 1771};
        assertEquals(1, solution.findNumbers(input));
    }
}