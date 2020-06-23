package ps_1401_1500.alg_1476_subrectangle_queries;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubrectangleQueriesTest {
    @Test
    public void testcase1() {
        int[][] input = new int[][]{new int[]{1, 2, 1}, new int[]{4, 3, 4}, new int[]{3, 2, 1}, new int[]{1, 1, 1}};

        SubrectangleQueries q = new SubrectangleQueries(input);
        assertEquals(1, q.getValue(0, 2));

        q.updateSubrectangle(0, 0, 3, 2, 5);
        assertEquals(5, q.getValue(0, 2));
        assertEquals(5, q.getValue(3, 1));

        q.updateSubrectangle(3, 0, 3, 2, 10);
        assertEquals(10, q.getValue(3, 1));
        assertEquals(5, q.getValue(0, 2));
    }

    @Test
    public void testcase2() {
        int[][] input = new int[][]{new int[]{1, 1, 1}, new int[]{2, 2, 2}, new int[]{3, 3, 3}};

        SubrectangleQueries q = new SubrectangleQueries(input);
        assertEquals(1, q.getValue(0, 0));

        q.updateSubrectangle(0, 0, 2, 2, 100);
        assertEquals(100, q.getValue(0, 0));
        assertEquals(100, q.getValue(2, 2));

        q.updateSubrectangle(1, 1, 2, 2, 20);
        assertEquals(20, q.getValue(2, 2));
    }
}