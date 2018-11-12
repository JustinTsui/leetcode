package alg_811_subdomain_visit_count;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/subdomain-visit-count/
 */
class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.subdomainVisits(new String[] {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"}));
    }

    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();

        for (String cpdomain : cpdomains) {
            String[] split = cpdomain.split(" ");
            int count = Integer.parseInt(split[0]);
            List<String> domains = decideDomains(split[1]);

            for (String domain : domains) {
                if (map.containsKey(domain)) {
                    map.put(domain, map.get(domain) + count);
                } else {
                    map.put(domain, count);
                }
            }
        }

        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.add(entry.getValue() + " " + entry.getKey());
        }
        return result;
    }

    private List<String> decideDomains(String domain) {
        if (!domain.contains(".")) {
            return Collections.emptyList();
        }

        List<String> result = new ArrayList<>();

        int index = 0;
        while (index != -1) {
            index = domain.indexOf(".", index + 1);
            result.add(domain.substring(index + 1));
        }
        return result;
    }
}