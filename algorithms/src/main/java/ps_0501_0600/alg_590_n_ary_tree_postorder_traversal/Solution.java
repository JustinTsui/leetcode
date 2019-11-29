package ps_0501_0600.alg_590_n_ary_tree_postorder_traversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/n-ary-tree-postorder-traversal/
 */
public class Solution {

    private List<Integer> result = new ArrayList<>();

    public List<Integer> postorder_recursive(Node root) {
        if (root == null) {
            return Collections.emptyList();
        }

        if (root.children != null) {
            for (Node child : root.children) {
                result = postorder_recursive(child);
            }
        }
        result.add(root.val);
        return result;
    }

    public List<Integer> postorder_iterative(Node root) {
        LinkedList<Node> nodes = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();

        if (root == null) {
            return Collections.emptyList();
        }

        nodes.push(root);
        while (!nodes.isEmpty()) {
            Node node = nodes.pollLast();
            if (node == null) {
                continue;
            }
            result.addFirst(node.val);
            if (node.children != null) {
                nodes.addAll(node.children);
            }
        }

        return result;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
