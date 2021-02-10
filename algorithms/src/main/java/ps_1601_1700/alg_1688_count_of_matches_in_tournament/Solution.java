package ps_1601_1700.alg_1688_count_of_matches_in_tournament;

/**
 * https://leetcode.com/problems/count-of-matches-in-tournament
 */
public class Solution {

    public int numberOfMatches2(int n) {
        return n - 1;
    }

    public int numberOfMatches(int n) {
        int sum = 0;
        while (n > 1) {
            sum += n / 2;
            n = (n + 1) / 2;
        }
        return sum;
    }
}
