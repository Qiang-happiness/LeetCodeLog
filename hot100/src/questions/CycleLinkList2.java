package questions;

import pojo.ListNode;

import java.util.HashSet;
import java.util.Set;

public class CycleLinkList2 {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> nodeSet = new HashSet<>();
        ListNode pNode = head;
        while (pNode != null){
            if (!nodeSet.isEmpty() && nodeSet.contains(pNode)) {
                return pNode;
            }

            nodeSet.add(pNode);
            pNode = pNode.next;
        }
        return null;
    }

    public ListNode detectCycle2(ListNode head) {
        ListNode slow = head, fast = null;
        if (slow != null) {
            fast = slow.next;
        }

        while (slow != null && fast != null && slow != fast) {
            slow = slow.next;
            if (fast.next != null){
                fast = fast.next.next;
            }else {
                fast = null;
            }
        }

        if (slow != null && fast != null && slow == fast){
            ListNode pNode = head;
            slow = slow.next;
            while (pNode != slow){
                pNode = pNode.next;
                slow = slow.next;
            }
            return pNode;
        }else {
            return null;
        }
    }
}
