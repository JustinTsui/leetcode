package ps_1001_1100.alg_1038_binary_search_tree_to_greater_sum_tree;

import common.TreeNode;

/**
 * https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree
 */
public class Solution {
    private int max = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (root == null) {
            return null;
        }
        bstToGst(root.right);
        root.val += max;
        max = root.val;
        bstToGst(root.left);
        return root;
    }
}
