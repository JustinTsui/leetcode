package ps_1301_1400.alg_1315_sum_of_nodes_with_even_valued_grandparent;

import common.TreeNode;

/**
 * https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent
 */
public class Solution {
    private int value = 0;
    public int sumEvenGrandparent(TreeNode root) {
        searcher(root);
        return value;
    }

    private void searcher(TreeNode node) {
        if (node == null) {
            return;
        }
        if ((node.val & 1) == 0) {
            if (node.left != null) {
                if (node.left.left != null) {
                    value += node.left.left.val;
                }
                if (node.left.right != null) {
                    value += node.left.right.val;
                }
            }

            if (node.right != null) {
                if (node.right.left != null) {
                    value += node.right.left.val;
                }
                if (node.right.right != null) {
                    value += node.right.right.val;
                }
            }
        }
        searcher(node.left);
        searcher(node.right);
    }
}
