package alg_682_baseball_game;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/baseball-game/
 */
public class Solution {
    public int calPoints(String[] ops) {
        List<Integer> list = new ArrayList<>(0);
        int sum = 0;
        for (String op : ops) {
            switch (op) {
                case "C":
                    sum -= list.get(list.size() - 1);
                    list.remove(list.size() - 1);
                    break;
                case "D":
                    int doubledValue = list.get(list.size() - 1);
                    doubledValue *= 2;
                    sum += doubledValue;
                    list.add(doubledValue);
                    break;
                case "+":
                    int add1 = list.get(list.size() - 1);
                    int add2 = list.get(list.size() - 2);
                    int sumValue = add1 + add2;
                    sum += sumValue;
                    list.add(sumValue);
                    break;
                default:
                    // numbers
                    int value = Integer.valueOf(op);
                    sum += value;
                    list.add(value);
            }
        }
        return sum;
    }
}
