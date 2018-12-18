package alg_937_reorder_log_files;


import java.util.Arrays;

/**
 * https://leetcode.com/problems/reorder-log-files/
 */
class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (o1, o2) -> {
            int index1 = o1.indexOf(" ") + 1;
            char ch1 = o1.charAt(index1);

            int index2 = o2.indexOf(" ") + 1;
            char ch2 = o2.charAt(index2);

            if (ch1 <= 57) {
                if (ch2 <= 57) {
                    return 0;
                } else {
                    return 1;
                }
            }
            if (ch2 <= 57) {
                return -1;
            }

            return o1.substring(index1).compareTo(o2.substring(index2));
        });
        return logs;
    }
}