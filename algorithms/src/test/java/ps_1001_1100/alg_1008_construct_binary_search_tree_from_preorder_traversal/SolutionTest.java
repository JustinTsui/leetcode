package ps_1001_1100.alg_1008_construct_binary_search_tree_from_preorder_traversal;

import common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testcase1() {
        TreeNode result = solution.bstFromPreorder(new int[]{8, 5, 1, 7, 10, 12});
        assertEquals(8, result.val);
        assertEquals(5, result.left.val);
        assertEquals(1, result.left.left.val);
        assertEquals(7, result.left.right.val);
        assertEquals(10, result.right.val);
        assertEquals(12, result.right.right.val);
    }
}