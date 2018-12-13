package alg_693_binary_number_with_alternating_bits;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-number-with-alternating-bits/
 */
public class Solution {

    public boolean hasAlternatingBits(int n) {
        List<Integer> alternatingBits = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(5);
            add(10);
            add(21);
            add(42);
            add(85);
            add(170);
            add(341);
            add(682);
            add(1365);
            add(2730);
            add(5461);
            add(10922);
            add(21845);
            add(43690);
            add(87381);
            add(174762);
            add(349525);
            add(699050);
            add(1398101);
            add(2796202);
            add(5592405);
            add(11184810);
            add(22369621);
            add(44739242);
            add(89478485);
            add(178956970);
            add(357913941);
            add(715827882);
            add(1431655765);
        }};

        int index = Collections.binarySearch(alternatingBits, n);
        return index >= 0;
    }

    private List<Integer> calcAlternatingBits() {
        List<Integer> result = new ArrayList<>();
        int value = 0;
        boolean addZero = false;
        while (value >= 0) {
            value = value << 1;
            if (value < 0) {
                break;
            }

            if (!addZero) {
                value++;
            }
            addZero = !addZero;
            result.add(value);
        }

        return result;
    }
}
