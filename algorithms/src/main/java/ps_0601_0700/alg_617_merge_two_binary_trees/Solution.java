package ps_0601_0700.alg_617_merge_two_binary_trees;

import common.TreeNode;

/**
 * https://leetcode.com/problems/merge-two-binary-trees/
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }

        if (t1 == null) {
            return t2;
        }

        if (t2 == null) {
            return t1;
        }

        int value = t1.val + t2.val;
        TreeNode left = mergeTrees(t1.left, t2.left);
        TreeNode right = mergeTrees(t1.right, t2.right);

        TreeNode result = new TreeNode(value);
        result.left = left;
        result.right = right;

        return result;
    }
}
