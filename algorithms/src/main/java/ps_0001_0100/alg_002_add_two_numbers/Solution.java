package ps_0001_0100.alg_002_add_two_numbers;


import common.ListNode;

public class Solution {
    private ListNode trim(ListNode list) {
        ListNode index = list;
        ListNode next = list.next;
        while (next.next != null) {
            index = index.next;
            next = next.next;
        }
        if (next.val == 0) {
            index.next = null;
        }
        return list;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode resultIndex = result;
        ListNode index1 = l1;
        ListNode index2 = l2;

        while (index1 != null || index2 != null) {
            int val1 = index1 == null ? 0 : index1.val;
            int val2 = index2 == null ? 0 : index2.val;
            if (resultIndex.val + val1 + val2 >= 10) {
                resultIndex.val = (resultIndex.val + val1 + val2) % 10;
                resultIndex.next = new ListNode(1);
            } else {
                resultIndex.val += val1 + val2;
                resultIndex.next = new ListNode(0);
            }

            index1 = index1 == null ? null : index1.next;
            index2 = index2 == null ? null : index2.next;
            resultIndex = resultIndex.next;
        }

        return trim(result);
    }
}