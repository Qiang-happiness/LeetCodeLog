package main;
import pojo.ListNode;
import questions.*;

import java.util.List;


public class TestMain {
    public static void main(String[] args) {
        CycleLinkList2 cycleLinkList  = new CycleLinkList2();

        ListNode node0 = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(-4);
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;

        ListNode node = cycleLinkList.detectCycle2(null);
        System.out.println(node);
    }
}
