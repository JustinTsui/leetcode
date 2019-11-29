package ps_0901_1000.alg_953_verifying_an_alien_dictionary;

/**
 * https://leetcode.com/problems/verifying-an-alien-dictionary/
 */
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        for (int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];

            int word1Index = 0;
            int word2Index = 0;
            int word1Length = word1.length();
            int word2Length = word2.length();

            while (word1Index < word1Length || word2Index < word2Length) {
                int sequence1 = alphabetIndex(word1, word1Index, order);
                int sequence2 = alphabetIndex(word2, word2Index, order);
                if (sequence1 == sequence2) {
                    word1Index++;
                    word2Index++;
                } else {
                    if (sequence1 > sequence2) {
                        return false;
                    }
                    break;
                }
            }
        }
        return true;
    }

    private int alphabetIndex(String word, int index, String order) {
        if (index >= word.length()) {
            return -1;
        }
        return order.indexOf(word.charAt(index));
    }
}