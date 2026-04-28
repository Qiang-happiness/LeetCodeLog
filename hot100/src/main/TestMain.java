package main;
import pojo.ListNode;
import pojo.Node;
import pojo.TreeNode;
import questions.*;

import java.util.ArrayList;
import java.util.List;


public class TestMain {
    public static void main(String[] args) {

        BinaryTreeMaxDepth binaryTreeMaxDepth = new BinaryTreeMaxDepth();

        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);

        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;

        int len = binaryTreeMaxDepth.maxDepth(node1);

        System.out.println(len);
    }
}
