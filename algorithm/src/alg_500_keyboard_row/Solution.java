package alg_500_keyboard_row;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/keyboard-row/
 */
class Solution {

    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (isInSameRow(word)) {
                result.add(word);
            }
        }

        String[] res = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }

    private boolean isInSameRow(String str) {
        char[] chars = str.toCharArray();
        int row = row(chars[0]);

        for (int i = 1; i < chars.length; i++) {
            if (row != row(chars[i])) {
                return false;
            }
        }
        return true;
    }

    private int row(char ch) {
        switch (ch) {
            case 'q':
            case 'Q':
            case 'w':
            case 'W':
            case 'e':
            case 'E':
            case 'r':
            case 'R':
            case 't':
            case 'T':
            case 'y':
            case 'Y':
            case 'u':
            case 'U':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'p':
            case 'P':
                return 0;
            case 'a':
            case 'A':
            case 's':
            case 'S':
            case 'd':
            case 'D':
            case 'f':
            case 'F':
            case 'g':
            case 'G':
            case 'h':
            case 'H':
            case 'j':
            case 'J':
            case 'k':
            case 'K':
            case 'l':
            case 'L':
                return 1;
            case 'z':
            case 'Z':
            case 'x':
            case 'X':
            case 'c':
            case 'C':
            case 'v':
            case 'V':
            case 'b':
            case 'B':
            case 'n':
            case 'N':
            case 'm':
            case 'M':
                return 2;
        }
        return -1;
    }
}