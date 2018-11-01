package _771_2.jewels.and.stones;

/**
 * https://leetcode.com/problems/jewels-and-stones/
 */
class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for (char stone : S.toCharArray()) {
            if (J.indexOf(stone) >= 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String jewel = "aA";
        String stone = "aAAbbbb";
        System.out.println(solution.numJewelsInStones(jewel, stone));

        jewel = "z";
        stone = "ZZ";
        System.out.println(solution.numJewelsInStones(jewel, stone));
    }
}