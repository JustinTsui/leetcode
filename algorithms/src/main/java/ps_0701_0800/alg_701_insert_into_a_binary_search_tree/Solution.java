package ps_0701_0800.alg_701_insert_into_a_binary_search_tree;

import common.TreeNode;

/**
 * https://leetcode.com/problems/insert-into-a-binary-search-tree
 */
public class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        helper(root, val);
        return root;
    }

    private void helper(TreeNode node, int val) {
        if (val > node.val) {
            if (node.right == null) {
                node.right = new TreeNode(val);
            } else {
                helper(node.right, val);
            }
        } else {
            if (node.left == null) {
                node.left = new TreeNode(val);
            } else {
                helper(node.left, val);
            }
        }
    }
}
