package ps_1201_1300.alg_1290_convert_binary_number_in_a_linked_list_to_integer;

import common.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testcase1() {
        ListNode input = new ListNode(1);
        input.next = new ListNode(0);
        input.next.next = new ListNode(1);
        assertEquals(5, solution.getDecimalValue(input));
    }

    @Test
    public void testcase2() {
        ListNode input = new ListNode(0);
        assertEquals(0, solution.getDecimalValue(input));
    }

    @Test
    public void testcase3() {
        ListNode input = new ListNode(1);
        assertEquals(1, solution.getDecimalValue(input));
    }

    @Test
    public void testcase4() {
        int[] values = new int[]{0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0};
        ListNode input = new ListNode(1);
        ListNode head = input;
        for (int i : values) {
            input.next = new ListNode(i);
            input = input.next;
        }

        assertEquals(18880, solution.getDecimalValue(head));
    }

    @Test
    public void testcase5() {
        ListNode input = new ListNode(0);
        input.next = new ListNode(0);
        assertEquals(0, solution.getDecimalValue(input));
    }
}