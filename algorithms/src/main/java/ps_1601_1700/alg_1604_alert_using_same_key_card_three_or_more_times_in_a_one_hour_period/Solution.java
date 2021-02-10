package ps_1601_1700.alg_1604_alert_using_same_key_card_three_or_more_times_in_a_one_hour_period;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/alert-using-same-key-card-three-or-more-times-in-a-one-hour-period
 */
public class Solution {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        List<String> result = new ArrayList<>();
        Map<String, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < keyName.length; i++) {
            int time = ((keyTime[i].charAt(0) - '0') * 10 + keyTime[i].charAt(1) - '0') * 60
                    + (keyTime[i].charAt(3) - '0') * 10 + keyTime[i].charAt(4) - '0';
            map.computeIfAbsent(keyName[i], t -> new ArrayList<>()).add(time);
        }

        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            List<Integer> times = entry.getValue();
            if (times.size() < 3) {
                continue;
            }
            Collections.sort(times);
            for (int i = 0; i <= times.size() - 3; i++) {
                if (times.get(i + 2) - times.get(i) <= 60) {
                    result.add(entry.getKey());
                    break;
                }
            }
        }

        Collections.sort(result);
        return result;
    }
}
