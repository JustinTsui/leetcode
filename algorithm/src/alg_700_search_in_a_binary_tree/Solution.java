package alg_700_search_in_a_binary_tree;

import common.TreeNode;

/**
 * https://leetcode.com/problems/search-in-a-binary-search-tree/
 */
public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        if (root.val == val) {
            return root;
        }

        if (root.val > val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }
}
