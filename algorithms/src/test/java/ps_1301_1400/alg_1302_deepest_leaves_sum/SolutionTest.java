package ps_1301_1400.alg_1302_deepest_leaves_sum;

import common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testcase1() {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);

        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        tree.right.right = new TreeNode(6);

        tree.left.left.left = new TreeNode(7);
        tree.right.right.right = new TreeNode(8);

        assertEquals(15, solution.deepestLeavesSum(tree));
    }

}