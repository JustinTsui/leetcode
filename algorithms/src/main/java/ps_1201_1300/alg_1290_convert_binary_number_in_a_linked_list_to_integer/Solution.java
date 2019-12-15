package ps_1201_1300.alg_1290_convert_binary_number_in_a_linked_list_to_integer;

import common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 */
public class Solution {
    public int getDecimalValue(ListNode head) {
        int result = 0;
        List<Integer> array = new ArrayList<>();
        while (head != null) {
            array.add(head.val);
            head = head.next;
        }

        int current = 1;
        for (int i = array.size() - 1; i >= 0; i--) {
            if (array.get(i) != 0) {
                result += current;
            }
            current *= 2;
        }
        return result;
    }
}
