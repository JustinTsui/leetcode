package ps_0601_0700.alg_654_maximum_binary_tree;

import common.TreeNode;

/**
 * https://leetcode.com/problems/maximum-binary-tree
 */
public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int from, int to) {
        if (from > to) {
            return null;
        }
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = from; i <= to; i++) {
            if (max < nums[i]) {
                max = nums[i];
                index = i;
            }
        }
        TreeNode node = new TreeNode(nums[index]);
        node.left = helper(nums, from, index - 1);
        node.right = helper(nums, index + 1, to);
        return node;
    }
}
