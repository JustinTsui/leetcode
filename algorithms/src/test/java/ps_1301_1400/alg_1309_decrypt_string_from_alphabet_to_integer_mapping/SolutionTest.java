package ps_1301_1400.alg_1309_decrypt_string_from_alphabet_to_integer_mapping;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testcase1() {
        String input = "10#11#12";
        assertEquals("jkab", solution.freqAlphabets(input));
    }

    @Test
    public void testcase2() {
        String input = "1326#";
        assertEquals("acz", solution.freqAlphabets(input));
    }

    @Test
    public void testcase3() {
        String input = "25#";
        assertEquals("y", solution.freqAlphabets(input));
    }

    @Test
    public void testcase4() {
        String input = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
        assertEquals("abcdefghijklmnopqrstuvwxyz", solution.freqAlphabets(input));
    }
}