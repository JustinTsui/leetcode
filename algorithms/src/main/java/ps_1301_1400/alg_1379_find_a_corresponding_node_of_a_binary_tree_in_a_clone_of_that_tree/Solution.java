package ps_1301_1400.alg_1379_find_a_corresponding_node_of_a_binary_tree_in_a_clone_of_that_tree;

import common.TreeNode;

/**
 * https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree
 */
public class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null) {
            return null;
        }
        if (original == target) {
            return cloned;
        }
        TreeNode left = getTargetCopy(original.left, cloned.left, target);
        return left != null ? left : getTargetCopy(original.right, cloned.right, target);
    }
}
