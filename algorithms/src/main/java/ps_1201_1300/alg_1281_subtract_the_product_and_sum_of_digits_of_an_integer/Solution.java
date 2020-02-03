package ps_1201_1300.alg_1281_subtract_the_product_and_sum_of_digits_of_an_integer;

public class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n > 0) {
            int value = n % 10;
            product *= value;
            sum += value;
            n /= 10;
        }

        return product - sum;
    }
}
