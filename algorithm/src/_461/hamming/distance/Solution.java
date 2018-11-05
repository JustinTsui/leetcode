package _461.hamming.distance;

/**
 * https://leetcode.com/problems/hamming-distance/
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if (((x & 1 << i) ^ (y & 1 << i)) != 0) {
                result ++;
            }
        }
        return result;
    }
}
