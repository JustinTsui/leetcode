package ps_0701_0800.alg_701_insert_into_a_binary_search_tree;

import common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testcase1() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);

        TreeNode actual = solution.insertIntoBST(root, 5);
        assertSame(root, actual);
        assertEquals(root.right.left.val, 5);
    }
}