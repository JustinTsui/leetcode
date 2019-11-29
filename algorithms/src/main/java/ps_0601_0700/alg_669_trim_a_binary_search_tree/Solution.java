package ps_0601_0700.alg_669_trim_a_binary_search_tree;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/trim-a-binary-search-tree/
 */
public class Solution {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        List<Integer> values = new ArrayList<>();
        searchTree(root, values, L, R);
        return buildTree(values);
    }

    private void searchTree(TreeNode node, List<Integer> values, int l, int r) {
        if (node == null) {
            return;
        }

        if (node.val >= l && node.val <= r) {
            values.add(node.val);
        }

        searchTree(node.left, values, l, r);
        searchTree(node.right, values, l, r);
    }

    private TreeNode buildTree(List<Integer> values) {
        if (values.size() <= 1) {
            return new TreeNode(values.get(0));
        }
        TreeNode root = new TreeNode(values.get(0));
        for (int i = 1; i < values.size(); i++) {
            insert(root, values.get(i));
        }
        return root;
    }

    private void insert(TreeNode node, int value) {
        if (value >= node.val) {
            if (node.right == null) {
                node.right = new TreeNode(value);
            } else {
                insert(node.right, value);
            }
        } else {
            if (node.left == null) {
                node.left = new TreeNode(value);
            } else {
                insert(node.left, value);
            }
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}