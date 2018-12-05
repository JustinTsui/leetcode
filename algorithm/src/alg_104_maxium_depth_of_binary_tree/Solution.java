package alg_104_maxium_depth_of_binary_tree;

import common.TreeNode;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        return depth(root, 0);
    }

    private int depth(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }

        int currentDepth = depth + 1;
        int leftDepth = depth(node.left, currentDepth);
        int rightDepth = depth(node.right, currentDepth);
        return Math.max(currentDepth, Math.max(leftDepth, rightDepth));
    }
}