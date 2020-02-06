package ps_1201_1300.alg_1299_replace_elements_with_greatest_element_on_right_side;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testcase1() {
        int[] input = new int[]{17, 18, 5, 4, 6, 1};
        assertArrayEquals(new int[]{18, 6, 6, 6, 1, -1}, solution.replaceElements(input));
    }
}