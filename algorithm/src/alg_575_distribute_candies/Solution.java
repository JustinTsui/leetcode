package alg_575_distribute_candies;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/distribute-candies/
 */
public class Solution {
    public int distributeCandies(int[] candies) {
        int maxCount = candies.length / 2;
        Set<Integer> set = new HashSet<>();

        for (int candy : candies) {
            set.add(candy);
        }

        if (set.size() >= maxCount) {
            return maxCount;
        } else {
            return set.size();
        }
    }
}
