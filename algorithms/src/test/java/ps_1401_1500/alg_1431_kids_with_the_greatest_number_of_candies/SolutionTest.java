package ps_1401_1500.alg_1431_kids_with_the_greatest_number_of_candies;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testcase1() {
        int[] candies = new int[]{2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> output = new ArrayList<>();
        output.add(true);
        output.add(true);
        output.add(true);
        output.add(false);
        output.add(true);

        assertEquals(output, solution.kidsWithCandies(candies, extraCandies));
    }

    @Test
    public void testcase2() {
        int[] candies = new int[]{4, 2, 1, 1, 2};
        int extraCandies = 1;
        List<Boolean> output = new ArrayList<>();
        output.add(true);
        output.add(false);
        output.add(false);
        output.add(false);
        output.add(false);

        assertEquals(output, solution.kidsWithCandies(candies, extraCandies));
    }

    @Test
    public void testcase3() {
        int[] candies = new int[]{12, 1, 12};
        int extraCandies = 10;
        List<Boolean> output = new ArrayList<>();
        output.add(true);
        output.add(false);
        output.add(true);

        assertEquals(output, solution.kidsWithCandies(candies, extraCandies));
    }
}