package alg_872_leaf_similar_trees;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/leaf-similar-trees/
 */
public class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = findLeaves(root1, new ArrayList<>());
        List<Integer> leaves2 = findLeaves(root2, new ArrayList<>());
        return isSameLeaves(leaves1, leaves2);
    }

    private boolean isSameLeaves(List<Integer> l1, List<Integer> l2) {
        if (l1.size() != l2.size()) {
            return false;
        }

        for (int i = 0; i < l1.size(); i++) {
            if (!l1.get(i).equals(l2.get(i))) {
                return false;
            }
        }
        return true;
    }


    private List<Integer> findLeaves(TreeNode node, List<Integer> values) {
        if (node.left == null && node.right == null) {
            values.add(node.val);
            return values;
        }

        if (node.left != null) {
            findLeaves(node.left, values);
        }
        if (node.right != null) {
            findLeaves(node.right, values);
        }
        return values;
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