package ps_0601_0700.alg_657_robot_returns_to_origin;

/**
 * https://leetcode.com/problems/robot-return-to-origin/
 */
class Solution {
    public boolean judgeCircle(String moves) {
        int horizonMoves = 0;
        int verticalMoves = 0;

        for (char ch : moves.toCharArray()) {
            switch (ch) {
                case 'U':
                    verticalMoves += 1;
                    break;
                case 'D':
                    verticalMoves -= 1;
                    break;
                case 'L':
                    horizonMoves += 1;
                    break;
                case 'R':
                    horizonMoves -= 1;
                    break;
            }
        }

        return horizonMoves == 0 && verticalMoves == 0;
    }
}