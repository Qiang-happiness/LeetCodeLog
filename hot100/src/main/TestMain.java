package main;
import pojo.ListNode;
import pojo.Node;
import questions.*;

import java.util.ArrayList;
import java.util.List;


public class TestMain {
    public static void main(String[] args) {
        KListsMerge kListsMerge = new KListsMerge();

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(5);

        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);

        ListNode node7 = new ListNode(2);
        ListNode node8 = new ListNode(6);

        node1.next = node2;
        node2.next = node3;

        node4.next = node5;
        node5.next = node6;

        node7.next = node8;

        ListNode[] lists = new ListNode[]{null};

        ListNode node = kListsMerge.mergeKLists(null);

        while (node != null){
            System.out.print(node.val + " ");
            node = node.next;
        }
    }
}
