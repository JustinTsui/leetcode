package ps_0601_0700.alg_654_maximum_binary_tree;

import common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testcase1() {
        TreeNode result = solution.constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5});
        assertEquals(6, result.val);
        assertEquals(3, result.left.val);
        assertEquals(5, result.right.val);
        assertEquals(2, result.left.right.val);
        assertEquals(1, result.left.right.right.val);
        assertEquals(0, result.right.left.val);
    }

    @Test
    public void testcase2() {
        TreeNode result = solution.constructMaximumBinaryTree(new int[]{3, 2, 1});
        assertEquals(3, result.val);
        assertEquals(2, result.right.val);
        assertEquals(1, result.right.right.val);
    }
}