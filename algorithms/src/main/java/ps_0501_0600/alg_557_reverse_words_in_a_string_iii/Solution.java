package ps_0501_0600.alg_557_reverse_words_in_a_string_iii;


/**
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
 */
class Solution {
    public String reverseWords(String s) {
        if (s == null) {
            return null;
        }

        String[] splits = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String split : splits) {

            for (int i = split.length() - 1; i >= 0; i--) {
                stringBuilder.append(split.charAt(i));
            }

            stringBuilder.append(" ");
        }

        return stringBuilder.substring(0, stringBuilder.length() - 1);
    }

    public String reverseWords_faster(String s) {
        int start = 0;
        int end = s.length();

        char[] chars = s.toCharArray();

        while (start < end) {
            int next = nextSpace(chars, start, end);
            reverse(chars, start, next);
            start = next + 2;
        }
        return new String(chars);
    }

    private int nextSpace(char[] arr, int start, int end) {
        for (int i = start; i < end; i++) {
            if (arr[i] == ' ') {
                return i - 1;
            } else if (i == end - 1) {
                return i;
            }
        }
        return -1;
    }

    private void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}