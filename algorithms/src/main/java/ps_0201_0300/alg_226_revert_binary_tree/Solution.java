package ps_0201_0300.alg_226_revert_binary_tree;

import common.TreeNode;

/**
 * https://leetcode.com/problems/invert-binary-tree/
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
