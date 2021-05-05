package ps_0001_0100.alg_027_remove_element;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testcase1() {
        assertEquals(2, solution.removeElement(new int[]{3, 2, 2, 3}, 3));
    }

    @Test
    public void testcase2() {
        assertEquals(5, solution.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }

    @Test
    public void testcase3() {
        assertEquals(0, solution.removeElement(new int[]{1}, 1));
    }
}