package ps_1201_1300.alg_1299_replace_elements_with_greatest_element_on_right_side;

/**
 * https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
 */
public class Solution {
    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length - 1];
        int cur = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (cur > max) {
                max = cur;
            }
            cur = arr[i];
            arr[i] = max;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}
