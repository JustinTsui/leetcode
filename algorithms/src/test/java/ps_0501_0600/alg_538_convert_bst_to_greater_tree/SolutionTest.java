package ps_0501_0600.alg_538_convert_bst_to_greater_tree;

import common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testcase1() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(1);
        root.right = new TreeNode(6);
        // 2nd layer
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        // 3rd layer
        root.left.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(8);

        TreeNode result = solution.convertBST(root);
        assertEquals(30, result.val);
        assertEquals(36, result.left.val);
        assertEquals(21, result.right.val);

        assertEquals(36, result.left.left.val);
        assertEquals(35, result.left.right.val);
        assertEquals(33, result.left.right.right.val);
        assertEquals(26, result.right.left.val);
        assertEquals(15, result.right.right.val);
        assertEquals(8, result.right.right.right.val);
    }
}