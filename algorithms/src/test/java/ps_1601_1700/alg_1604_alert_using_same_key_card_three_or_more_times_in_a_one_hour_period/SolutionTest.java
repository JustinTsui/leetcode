package ps_1601_1700.alg_1604_alert_using_same_key_card_three_or_more_times_in_a_one_hour_period;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testcase1() {
        List<String> result = solution.alertNames(
                new String[]{"daniel", "daniel", "daniel", "luis", "luis", "luis", "luis"},
                new String[]{"10:00", "10:40", "11:00", "09:00", "11:00", "13:00", "15:00"});
        assertEquals(1, result.size());
        assertEquals("daniel", result.get(0));
    }

    @Test
    public void testcase2() {
        List<String> result = solution.alertNames(
                new String[]{"alice", "alice", "alice", "bob", "bob", "bob", "bob"},
                new String[]{"12:01", "12:00", "18:00", "21:00", "21:20", "21:30", "23:00"});
        assertEquals(1, result.size());
        assertEquals("bob", result.get(0));
    }

    @Test
    public void testcase3() {
        List<String> result = solution.alertNames(
                new String[]{"john", "john", "john"},
                new String[]{"23:58", "23:59", "00:01"});
        assertEquals(0, result.size());
    }

    @Test
    public void testcase4() {
        List<String> result = solution.alertNames(
                new String[]{"leslie", "leslie", "leslie", "clare", "clare", "clare", "clare"},
                new String[]{"13:00", "13:20", "14:00", "18:00", "18:51", "19:30", "19:49"});
        assertEquals(2, result.size());
        assertEquals("clare", result.get(0));
        assertEquals("leslie", result.get(1));
    }
}