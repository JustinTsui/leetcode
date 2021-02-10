package ps_1701_1800.alg_1732_find_the_highest_altitude;

/**
 * https://leetcode.com/problems/find-the-highest-altitude
 */
public class Solution {
    public int largestAltitude(int[] gain) {
        int alt = 0;
        int result = 0;

        for (int i : gain) {
            alt += i;
            if (alt > result) {
                result = alt;
            }
        }
        return result;
    }
}
