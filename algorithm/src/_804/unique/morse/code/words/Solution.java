package _804.unique.morse.code.words;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/unique-morse-code-words/
 */
public class Solution {
    private static final String[] MORSE_CODE = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
            "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--",
            "-..-", "-.--", "--.."};

    private String toMorse(char letter) {
        return MORSE_CODE[letter - 97];
    }

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> morseSet = new HashSet<>();
        for (String word : words) {
            StringBuilder stringBuilder = new StringBuilder();
            for (char ch : word.toCharArray()) {
                stringBuilder.append(toMorse(ch));
            }
            morseSet.add(stringBuilder.toString());
        }
        return morseSet.size();
    }
}
