package questions;

import pojo.ListNode;

public class TwoNumbersAddition {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null){
            return l1 == null ? l2 : l1;
        }

        ListNode pNode1 = l1, pNode2 = l2;
        ListNode newList = null, tailNode = null;
        int addition = 0;
        while (pNode1 != null && pNode2 != null) {
            int temp = pNode1.val + pNode2.val + addition;
            addition = 0;
            if (temp >= 10) {
                addition = 1;
            }
            ListNode tempNode = new ListNode(temp % 10);
            tempNode.next = null;
            if (newList == null) {
                newList = tempNode;
            } else {
                tailNode.next = tempNode;
            }
            tailNode = tempNode;
            pNode1 = pNode1.next;
            pNode2 = pNode2.next;
        }

        while (pNode1 != null) {
            int temp = pNode1.val + addition;
            addition = 0;
            if (temp >= 10) {
                addition = 1;
            }
            ListNode tempNode = new ListNode(temp % 10);
            tempNode.next = null;
            tailNode.next = tempNode;
            tailNode = tempNode;
            pNode1 = pNode1.next;
        }

        while (pNode2 != null) {
            int temp = pNode2.val + addition;
            addition = 0;
            if (temp >= 10) {
                addition = 1;
            }
            ListNode tempNode = new ListNode(temp % 10);
            tempNode.next = null;
            tailNode.next = tempNode;
            tailNode = tempNode;
            pNode2 = pNode2.next;
        }

        if (addition != 0) {
            ListNode tempNode = new ListNode(addition);
            tempNode.next = null;
            tailNode.next = tempNode;
            tailNode = tempNode;
        }
        return newList;
    }
}
