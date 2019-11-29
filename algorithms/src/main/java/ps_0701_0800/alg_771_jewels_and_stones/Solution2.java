package ps_0701_0800.alg_771_jewels_and_stones;

/**
 * https://leetcode.com/problems/jewels-and-stones/
 */
class Solution2 {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for (char stone : S.toCharArray()) {
            if (J.indexOf(stone) >= 0) {
                count++;
            }
        }
        return count;
    }
}