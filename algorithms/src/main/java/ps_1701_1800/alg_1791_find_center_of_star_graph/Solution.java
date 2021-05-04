package ps_1701_1800.alg_1791_find_center_of_star_graph;

/**
 * https://leetcode.com/problems/find-center-of-star-graph/
 */
class Solution {
    public int findCenter(int[][] edges) {
        int[] pts = new int[edges.length + 1];
        for (int[] edge : edges) {
            for (int j = 0; j < edges[0].length; j++) {
                pts[edge[j] - 1]++;
            }
        }
        int max = 0;
        int maxIdx = 0;
        for (int i = 0; i < pts.length; i++) {
            if (pts[i] > max) {
                max = pts[i];
                maxIdx = i;
            }
        }
        return maxIdx + 1;
    }
}