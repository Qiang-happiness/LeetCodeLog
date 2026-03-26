package main;
import pojo.ListNode;
import pojo.Node;
import questions.*;

import java.util.List;


public class TestMain {
    public static void main(String[] args) {
        RandomListCopy randomListCopy = new RandomListCopy();

        Node node0 = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
//        ListNode node1 = new ListNode(2);
//        ListNode node2 = new ListNode(3);
//        ListNode node3 = new ListNode(4);
//        ListNode node4 = new ListNode(5);
        node0.next = node1;
        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;

        Node node = randomListCopy.copyRandomList2(node0);

        while (node != null) {
            if (node.random != null){
                System.out.println(node.val + " " + node.random.val);
            }
            System.out.println(node.val + " " + "null");
            node = node.next;
        }
    }
}
