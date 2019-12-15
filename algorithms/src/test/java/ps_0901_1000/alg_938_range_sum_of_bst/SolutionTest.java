package ps_0901_1000.alg_938_range_sum_of_bst;

import common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void testcase1() {
        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);

        root.right = new TreeNode(15);
        root.right.right = new TreeNode(18);

        assertEquals(32, solution.rangeSumBST(root, 7, 15));
    }

    @Test
    public void testcase2() {
        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(1);
        root.left.right = new TreeNode(7);
        root.left.right.left = new TreeNode(6);

        root.right = new TreeNode(15);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(18);

        assertEquals(23, solution.rangeSumBST(root, 6, 10));
    }
}