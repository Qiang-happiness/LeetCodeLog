package main;
import pojo.ListNode;
import pojo.Node;
import pojo.TreeNode;
import questions.*;

import java.util.ArrayList;
import java.util.List;


public class TestMain {
    public static void main(String[] args) {

        TraversalInOrder traversalInOrder = new TraversalInOrder();

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);

        node1.right = node2;
        node2.left = node3;

        List<Integer> integers = traversalInOrder.inorderTraversal(node1);

        for (Integer i : integers) {
            System.out.print(i + " ");
        }
    }
}
