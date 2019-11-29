package ps_0401_0500.alg_412_fizz_buzz;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/fizz-buzz/
 */
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>(0);

        for (int i = 1; i <= n; i++) {
            int mod3 = i % 3;
            int mod5 = i % 5;
            if (mod3 == 0 && mod5 == 0) {
                result.add("FizzBuzz");
            } else if (mod3 == 0) {
                result.add("Fizz");
            } else if (mod5 == 0) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }

        }
        return result;
    }
}
