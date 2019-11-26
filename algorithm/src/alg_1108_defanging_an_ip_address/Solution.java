package alg_1108_defanging_an_ip_address;

/**
 * https://leetcode.com/problems/defanging-an-ip-address/
 */
public class Solution {

    /*
    String.replace is slower than charAt
     */
    public String defangIPaddr2(String address) {
        return address.replace(".", "[.]");
    }

    public String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder();
        for (char ch : address.toCharArray()) {
            if (ch == '.') {
                result.append("[.]");
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.defangIPaddr("255.100.50.0"));
        System.out.println(solution.defangIPaddr("127.0.0.1"));
        System.out.println(solution.defangIPaddr("1.1.1.1"));
    }
}
