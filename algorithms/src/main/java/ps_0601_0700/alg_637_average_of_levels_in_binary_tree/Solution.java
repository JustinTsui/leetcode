package ps_0601_0700.alg_637_average_of_levels_in_binary_tree;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/average-of-levels-in-binary-tree/
 */
public class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<TreeNode> subNodes1 = new ArrayList<>();
        List<TreeNode> subNodes2 = new ArrayList<>();
        int level = 0;
        List<Double> result = new ArrayList<>();

        subNodes1.add(root);

        while (subNodes1.size() != 0 || subNodes2.size() != 0) {
            if (level % 2 == 0) {
                sum(subNodes1, subNodes2, result);
            } else {
                sum(subNodes2, subNodes1, result);
            }
            level++;
        }

        return result;
    }

    private void sum(List<TreeNode> currentLevel, List<TreeNode> subLevel, List<Double> result) {
        subLevel.clear();
        if (currentLevel.size() == 0) {
            return;
        }

        long sum = 0L;
        for (TreeNode node : currentLevel) {
            if (node.left != null) {
                subLevel.add(node.left);
            }
            if (node.right != null) {
                subLevel.add(node.right);
            }
            sum += node.val;
        }
        result.add(1D * sum / currentLevel.size());
    }

}
