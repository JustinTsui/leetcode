package ps_0501_0600.alg_538_convert_bst_to_greater_tree;

import common.TreeNode;

/**
 * https://leetcode.com/problems/convert-bst-to-greater-tree
 */
public class Solution {
    int max = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        convertBST(root.right);
        root.val += max;
        max = root.val;
        convertBST(root.left);
        return root;
    }
}
