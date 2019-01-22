package alg_965_univalued_binary_tree;

import common.TreeNode;

/**
 * https://leetcode.com/problems/univalued-binary-tree/
 */
public class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return false;
        }

        return traversal(root, root.val);
    }

    public boolean traversal(TreeNode root, int val) {
        if (root == null) {
            return true;
        }

        if (root.val != val) {
            return false;
        }

        return traversal(root.left, val) && traversal(root.right, val);
    }
}
