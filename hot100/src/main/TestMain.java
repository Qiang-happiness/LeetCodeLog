package main;
import pojo.ListNode;
import questions.*;

import java.util.List;


public class TestMain {
    public static void main(String[] args) {
        KGroupReverse kGroupReverse = new KGroupReverse();

        ListNode node0 = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode node = kGroupReverse.reverseKGroup2(node0, 3);

        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
