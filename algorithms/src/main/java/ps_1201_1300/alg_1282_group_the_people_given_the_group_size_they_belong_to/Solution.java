package ps_1201_1300.alg_1282_group_the_people_given_the_group_size_they_belong_to;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to
 */
public class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int index = 0; index < groupSizes.length; index++) {
            int value = groupSizes[index];
            if (map.containsKey(value)) {
                map.get(value).add(index);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(index);
                map.put(value, list);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            int size = entry.getKey();
            List<Integer> list = entry.getValue();
            if (list.size() <= size) {
                result.add(list);
            } else {
                int start = 0;
                while (start + size <= list.size()) {
                    result.add(list.subList(start, start + size));
                    start += size;
                }
            }
        }
        return result;
    }
}
