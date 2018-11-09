package alg_590_n_ary_tree_postorder_traversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

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

    public static void main(String[] args) {
        Solution solution = new Solution();
        Node node1 = new Node(); node1.val = 1;
        Node node2 = new Node(); node2.val = 2;
        Node node3 = new Node(); node3.val = 3;
        Node node4 = new Node(); node4.val = 4;
        Node node5 = new Node(); node5.val = 5;
        Node node6 = new Node(); node6.val = 6;

        node1.children = new ArrayList<Node>() {{ add(node3); add(node2); add(node4);}};
        node3.children = new ArrayList<Node>() {{ add(node5); add(node6);}};

        System.out.println(solution.postorder_iterative(node1));
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
