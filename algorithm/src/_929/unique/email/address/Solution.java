package _929.unique.email.address;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/unique-email-addresses/
 */
public class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> emailSet = new HashSet<>();
        for (String email : emails) {
            String[] split = email.split("@");
            String prefix = split[0];
            String suffix = split[1];

            prefix = prefix.replace(".", "");
            if (prefix.contains("+")) {
                prefix = prefix.substring(0, prefix.indexOf("+"));
            }

            emailSet.add(prefix + "@" + suffix);
        }
        return emailSet.size();
    }
}
