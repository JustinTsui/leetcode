package alg_344_reverse_string;

/**
 * https://leetcode.com/problems/reverse-string/
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseString("hello"));
        System.out.println(solution.reverseString("A man, a plan, a canal: Panama"));
        System.out.println(solution.reverseString(" "));
    }

    public String reverseString(String s) {
        char[] chars = s.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }

    public String reverseString2(String s) {
        String[] split = s.split(" ");
        if (split.length == 0) {
            return s;
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = split.length - 1; i >= 0; i--) {
            stringBuilder.append(new StringBuffer(split[i]).reverse()).append(' ');
        }
        return stringBuilder.substring(0, stringBuilder.length() - 1);
    }

}
