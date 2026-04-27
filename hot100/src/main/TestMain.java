package main;
import pojo.ListNode;
import pojo.Node;
import questions.*;

import java.util.List;


public class TestMain {
    public static void main(String[] args) {
        SortListASC sortListASC = new SortListASC();

        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
//        node4.next = node5;

        ListNode node = sortListASC.sortList(node1);

        while (node != null){
            System.out.print(node.val + " ");
            node = node.next;
        }
    }
}
