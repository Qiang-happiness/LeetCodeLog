package questions;

import pojo.ListNode;

public class TwoTwoSwap {
    public ListNode swapPairs(ListNode head) {
        ListNode pNode = head;
        ListNode lastTail = null;
        while (pNode != null && pNode.next != null) {
            if (pNode == head) {
                head = pNode.next;
            }
            ListNode temp = pNode.next;
            pNode.next = temp.next;
            temp.next = pNode;

            if (lastTail != null) {
                lastTail.next = temp;
            }

            lastTail = pNode;
            pNode = pNode.next;
        }
        return head;
    }
}
