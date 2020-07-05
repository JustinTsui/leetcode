package ps_1201_1300.alg_1282_group_the_people_given_the_group_size_they_belong_to;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final BetterSolution solution = new BetterSolution();

    @Test
    public void testcase1() {
        int[] input = new int[]{3, 3, 3, 3, 3, 1, 3};
        List<List<Integer>> result = solution.groupThePeople(input);
        assertEquals(3,result.size());
    }
}