package alg_999_available_captures_for_rock;

/**
 * https://leetcode.com/problems/available-captures-for-rook/
 */
class Solution {

    public int numRookCaptures(char[][] board) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 'R') {
                    x = i;
                    y = j;
                    break;
                }
            }
        }

        int result = 0;

        // north
        for (int i = x - 1; i >= 0; i--) {
            if (isOurChess(board[i][y])) {
                break;
            }
            if (isTheirChess(board[i][y])) {
                result++;
                break;
            }
        }

        // south
        for (int i = x + 1; i < 8; i++) {
            if (isOurChess(board[i][y])) {
                break;
            }
            if (isTheirChess(board[i][y])) {
                result++;
                break;
            }
        }

        // west
        for (int i = y - 1; i >= 0; i--) {
            if (isOurChess(board[x][i])) {
                break;
            }
            if (isTheirChess(board[x][i])) {
                result++;
                break;
            }
        }

        // east
        for (int i = y + 1; i < 8; i++) {
            if (isOurChess(board[x][i])) {
                break;
            }
            if (isTheirChess(board[x][i])) {
                result++;
                break;
            }
        }

        return result;
    }

    private boolean isOurChess(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }

    private boolean isTheirChess(char ch) {
        return ch >= 'a';
    }
}