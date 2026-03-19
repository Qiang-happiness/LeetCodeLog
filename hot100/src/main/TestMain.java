package main;
import pojo.ListNode;
import questions.*;

import java.util.List;


public class TestMain {
    public static void main(String[] args) {
        ListReverse listReverse = new ListReverse();

        ListNode head = new ListNode(1, null);
        ListNode pNode = head;

        for (int i = 1; i < 5; i++){
            ListNode node = new ListNode(i + 1, null);
            pNode.next = node;
            pNode = node;
        }

        ListNode reversedList = listReverse.reverseList(head);
        pNode = reversedList;
        while (pNode != null){
            System.out.print(pNode.val + " ");
            pNode = pNode.next;
        }
    }
}
