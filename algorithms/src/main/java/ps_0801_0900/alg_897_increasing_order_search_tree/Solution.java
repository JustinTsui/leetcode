package ps_0801_0900.alg_897_increasing_order_search_tree;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/increasing-order-search-tree/
 */
public class Solution {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        fillValues(root, values);

        TreeNode result = new TreeNode(values.get(0));
        TreeNode pointer = result;
        for (int i = 1; i < values.size(); i++) {
            pointer.right = new TreeNode(values.get(i));
            pointer = pointer.right;
        }
        return result;
    }

    private void fillValues(TreeNode node, List<Integer> values) {
        if (node == null) {
            return;
        }
        fillValues(node.left, values);
        values.add(node.val);
        fillValues(node.right, values);
    }
}

