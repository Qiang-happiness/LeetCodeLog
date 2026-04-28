package questions;

import pojo.TreeNode;

public class BinaryTreeMaxDepth {
    public int curLen = 0;
    public int maxLen = 0;

    public int maxDepth(TreeNode root) {
        if (root == null) return curLen;

        TreeNode left = root.left;
        TreeNode right = root.right;

        ++curLen;
        if (curLen > maxLen) maxLen = curLen;
        int maxLeftLen = maxDepth(left);
        int maxRightLen = maxDepth(right);
        --curLen;

        return maxLen;
    }
}
