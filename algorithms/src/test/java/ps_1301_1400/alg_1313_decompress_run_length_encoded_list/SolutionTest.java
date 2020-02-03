package ps_1301_1400.alg_1313_decompress_run_length_encoded_list;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testcase1() {
        int[] input = new int[]{1, 2, 3, 4};
        assertArrayEquals(new int[]{2, 4, 4, 4}, solution.decompressRLElist(input));
    }
}