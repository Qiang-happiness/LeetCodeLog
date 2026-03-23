package main;
import pojo.ListNode;
import questions.*;

import java.util.List;


public class TestMain {
    public static void main(String[] args) {
        CycleLinkList cycleLinkList  = new CycleLinkList();

        ListNode node3 = new ListNode(-4);
        ListNode node2 = new ListNode(0, node3);
        ListNode node1 = new ListNode(2, node2);
        ListNode node0 = new ListNode(3, node1);
        node3.next = node1;

        boolean tag = cycleLinkList.hasCycle2(node0);
        System.out.println(tag);
    }
}
