package alg_292_nim_game;

/**
 * https://leetcode.com/problems/nim-game/
 */
public class Solution {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
