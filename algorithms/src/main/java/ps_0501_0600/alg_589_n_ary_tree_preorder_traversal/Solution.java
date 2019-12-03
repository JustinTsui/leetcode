package ps_0501_0600.alg_589_n_ary_tree_preorder_traversal;

import common.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/n-ary-tree-preorder-traversal/
 */
class Solution {
    public List<Integer> preorder_iterative(Node root) {
        if (root == null) {
            return Collections.emptyList();
        }

        Stack<Node> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();

        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();

            result.add(node.val);
            if (node.children != null) {
                for (int i = node.children.size() - 1; i >= 0; i--) {
                    stack.push(node.children.get(i));
                }
            }
        }
        return result;
    }

    public List<Integer> preorder_recursive(Node root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<Integer> result = new ArrayList<>();
        result = travel(result, root);
        return result;
    }

    private List<Integer> travel(List<Integer> list, Node node) {
        list.add(node.val);
        if (node.children != null) {
            for (Node child : node.children) {
                list = travel(list, child);
            }
        }
        return list;
    }
}