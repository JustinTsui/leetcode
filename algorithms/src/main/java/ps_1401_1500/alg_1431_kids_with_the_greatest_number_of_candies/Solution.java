package ps_1401_1500.alg_1431_kids_with_the_greatest_number_of_candies;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 */
public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);
        int max = -1;
        for (int i : candies) {
            max = Math.max(max, i);
        }

        for (int i : candies) {
            result.add(i + extraCandies >= max);
        }
        return result;
    }
}
