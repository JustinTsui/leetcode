package ps_1401_1500.alg_1409_queries_on_a_permutation_with_key;

/**
 * https://leetcode.com/problems/queries-on-a-permutation-with-key
 * A better solution is to use the
 * <a href="https://en.wikipedia.org/wiki/Fenwick_tree">Fenwick tree(binary indexed tree)</a>,
 * as the problem is nearly to calculate the sum before it.
 * http://zxi.mytechroad.com/blog/simulation/leetcode-1409-queries-on-a-permutation-with-key/
 */
public class Solution {
    public int[] processQueries(int[] queries, int m) {
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = i + 1;
        }
        int[] result = new int[queries.length];
        int index = 0;
        for (int i : queries) {
            for (int j = 0; j < p.length; j++) {
                if (i == p[j]) {
                    result[index] = j;
                    index++;
                    System.arraycopy(p, 0, p, 1, j);
                    p[0] = i;
                    break;
                }


            }
        }
        return result;
    }
}