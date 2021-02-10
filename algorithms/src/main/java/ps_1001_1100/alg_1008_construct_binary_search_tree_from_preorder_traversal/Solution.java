package ps_1001_1100.alg_1008_construct_binary_search_tree_from_preorder_traversal;

import common.TreeNode;

/**
 * https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal
 */
public class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode result = new TreeNode(preorder[0]);
        for (int i = 1; i < preorder.length; i++) {
            set(result, preorder[i]);
        }

        return result;
    }

    private void set(TreeNode root, int value) {
        if (root.val > value) {
            if (root.left == null) {
                root.left = new TreeNode(value);
            } else {
                set(root.left, value);
            }
        } else {
            if (root.right == null) {
                root.right = new TreeNode(value);
            } else {
                set(root.right, value);
            }
        }
    }
}
