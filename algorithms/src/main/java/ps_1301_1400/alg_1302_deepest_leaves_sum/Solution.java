package ps_1301_1400.alg_1302_deepest_leaves_sum;

import common.TreeNode;

/**
 * https://leetcode.com/problems/deepest-leaves-sum
 */
public class Solution {
    private int result = 0;
    private int depth = 0;
    public int deepestLeavesSum(TreeNode root) {
        search(root, 0);
        return result;
    }

    private void search(TreeNode node, int depth) {
        if (node == null) {
            return;
        }
        if (depth > this.depth) {
            result = node.val;
            this.depth = depth;
        } else if (depth == this.depth) {
            result += node.val;
        }
        search(node.left, depth + 1);
        search(node.right, depth + 1);
    }
}
