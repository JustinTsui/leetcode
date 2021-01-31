package ps_1701_1800.alg_1720_decode_xored_array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testcase1() {
        assertArrayEquals(new int[]{1, 0, 2, 1}, solution.decode(new int[]{1, 2, 3}, 1));
    }

    @Test
    public void testcase2() {
        assertArrayEquals(new int[]{4, 2, 0, 7, 4}, solution.decode(new int[]{6, 2, 7, 3}, 4));
    }
}