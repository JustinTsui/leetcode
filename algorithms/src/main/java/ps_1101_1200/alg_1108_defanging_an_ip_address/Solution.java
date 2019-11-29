package ps_1101_1200.alg_1108_defanging_an_ip_address;

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
}
