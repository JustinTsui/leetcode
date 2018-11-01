package _771.jewels.and.stones;

/**
 * https://leetcode.com/problems/jewels-and-stones/
 */
class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        char[] jewels = J.toCharArray();
        char[] stones = S.toCharArray();

        for (int i = 0; i < jewels.length; i++) {
            char jewel = jewels[i];
            for (int j = 0; j < stones.length; j++) {
                char stone = stones[j];
                if (jewel == stone) {
                    count++;
                    stones[j] = '\u0000';
                }
            }
        }

        return count;
    }
}