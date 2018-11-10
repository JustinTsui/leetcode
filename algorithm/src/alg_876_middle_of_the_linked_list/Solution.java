package alg_876_middle_of_the_linked_list;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/middle-of-the-linked-list/
 */
public class Solution {

    public ListNode middleNode(ListNode head) {
        List<ListNode> list = new ArrayList<>();

        ListNode node = head;
        while (node != null) {
            list.add(node);
            node = node.next;
        }

        return list.get(list.size() / 2);
    }

    public ListNode middleNode_twopointers(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
