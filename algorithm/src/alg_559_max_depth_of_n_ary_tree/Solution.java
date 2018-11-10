package alg_559_max_depth_of_n_ary_tree;

import java.util.ArrayList;
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

    public static void main(String[] args) {
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        Node node5 = new Node();
        Node node6 = new Node();
        Node node7 = new Node();

        node1.children = new ArrayList<Node>() {{
            add(node3);
            add(node2);
            add(node4);
        }};

        node3.children = new ArrayList<Node>() {{
           add(node5);
           add(node6);
        }};

        node5.children = new ArrayList<Node>() {{
           add(node7);
        }};

        Solution solution = new Solution();
        System.out.println(solution.maxDepth(node1));
    }
}


class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};