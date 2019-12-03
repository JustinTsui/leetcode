package ps_0401_0500.alg_429_n_ary_tree_level_order_traversal;

import common.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/n-ary-tree-level-order-traversal/
 */
public class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        traversal(root, result, 0);
        return result;
    }

    private void traversal(Node node, List<List<Integer>> result, int level) {
        if (node == null) {
            return;
        }

        if (result.size() <= level) {
            result.add(new ArrayList<>());
        }
        result.get(level).add(node.val);

        if (node.children != null && node.children.size() != 0) {
            for (Node subNode : node.children) {
                traversal(subNode, result, level + 1);
            }
        }
    }
}
