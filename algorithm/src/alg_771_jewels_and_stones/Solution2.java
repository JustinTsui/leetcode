package alg_771_jewels_and_stones;

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

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        String jewel = "aA";
        String stone = "aAAbbbb";
        System.out.println(solution.numJewelsInStones(jewel, stone));

        jewel = "z";
        stone = "ZZ";
        System.out.println(solution.numJewelsInStones(jewel, stone));
    }
}