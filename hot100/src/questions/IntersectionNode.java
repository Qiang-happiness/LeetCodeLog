package questions;

import pojo.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */

public class IntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0, lenB = 0;
        ListNode pA = headA, pB = headB;
        while (pA != null){
            lenA++;
            pA = pA.next;
        }
        pA = headA;
        while (pB != null){
            lenB++;
            pB = pB.next;
        }
        pB = headB;
        if (lenA > lenB){
            int step = lenA - lenB;
            while (step > 0){
                pA = pA.next;
                step--;
            }
        }else {
            int step = lenB - lenA;
            while (step > 0){
                pB = pB.next;
                step--;
            }
        }
        while (pA != pB){
            if (pA == null) break;
            pA = pA.next;
            pB = pB.next;
        }
        return pA;
    }
}
