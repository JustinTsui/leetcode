package ps_1301_1400.alg_1304_find_n_unique_integers_sum_up_to_zero;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testcase1() {
        int input = 5;
        int[] output = solution.sumZero(input);
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i : output) {
            set.add(i);
            sum += i;
        }
        assertEquals(0, sum);
        assertEquals(input, set.size());
    }

    @Test
    public void testcase2() {
        int input = 3;
        int[] output = solution.sumZero(input);
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i : output) {
            set.add(i);
            sum += i;
        }
        assertEquals(0, sum);
        assertEquals(input, set.size());
    }

    @Test
    public void testcase3() {
        int input = 1;
        int[] output = solution.sumZero(input);
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i : output) {
            set.add(i);
            sum += i;
        }
        assertEquals(0, sum);
        assertEquals(input, set.size());
    }

    @Test
    public void testcase4() {
        int input = 4;
        int[] output = solution.sumZero(input);
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i : output) {
            set.add(i);
            sum += i;
        }
        assertEquals(0, sum);
        assertEquals(input, set.size());
    }
}