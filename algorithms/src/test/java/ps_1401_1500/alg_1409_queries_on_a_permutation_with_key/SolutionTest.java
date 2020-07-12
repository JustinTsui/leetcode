package ps_1401_1500.alg_1409_queries_on_a_permutation_with_key;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testcase1() {
        int[] query = new int[]{3, 1, 2, 1};
        int m = 5;
        int[] output = new int[]{2, 1, 2, 1};
        assertArrayEquals(output, solution.processQueries(query, m));
    }

    @Test
    public void testcase2() {
        int[] query = new int[]{4, 1, 2, 2};
        int m = 4;
        int[] output = new int[]{3, 1, 2, 0};
        assertArrayEquals(output, solution.processQueries(query, m));
    }

    @Test
    public void testcase3() {
        int[] query = new int[]{7, 5, 5, 8, 3};
        int m = 8;
        int[] output = new int[]{6, 5, 0, 7, 5};
        assertArrayEquals(output, solution.processQueries(query, m));
    }

}