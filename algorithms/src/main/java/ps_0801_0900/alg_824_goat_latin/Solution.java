package ps_0801_0900.alg_824_goat_latin;

/**
 * https://leetcode.com/problems/goat-latin/
 */
public class Solution {
    public String toGoatLatin(String S) {
        String[] split = S.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder tail = new StringBuilder();
        tail.append("a");

        for (String word : split) {
            char firstLetter = word.charAt(0);
            if (isVowel(firstLetter)) {
                stringBuilder.append(word).append("ma");
            } else {
                stringBuilder.append(word.substring(1)).append(firstLetter).append("ma");
            }

            stringBuilder.append(tail);
            tail.append("a");
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }

    private boolean isVowel(char ch) {
        switch (ch) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                return true;
            default:
                return false;
        }
    }
}
