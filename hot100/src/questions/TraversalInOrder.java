package questions;

import pojo.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class TraversalInOrder {
    public List<Integer> ret = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();

        TreeNode left = root.left;
        TreeNode right = root.right;

        inorderTraversal(left);
        ret.add(root.val);
        inorderTraversal(right);

        return ret;
    }
}
