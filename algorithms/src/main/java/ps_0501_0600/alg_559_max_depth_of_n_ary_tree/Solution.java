package ps_0501_0600.alg_559_max_depth_of_n_ary_tree;

import common.Node;

import java.util.List;

/**
 * https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
 */
public class Solution {

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        return depth(root, 1);
    }

    private int depth(Node node, int depth) {
        if (node == null || node.children == null || node.children.size() == 0) {
            return depth;
        }

        int max = depth + 1;
        for (Node child : node.children) {
            int childDepth = depth(child, depth + 1);
            max = Math.max(max, childDepth);
        }

        return max;
    }
}