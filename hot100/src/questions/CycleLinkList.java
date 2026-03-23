package questions;

import pojo.ListNode;

import java.util.HashSet;
import java.util.Set;

public class CycleLinkList {
    public boolean hasCycle(ListNode head) {
        boolean tag = false;
        Set<ListNode> nodeSet = new HashSet<>();
        ListNode pNode = head;
        while (pNode != null){
            if (!nodeSet.isEmpty() && nodeSet.contains(pNode)) {
                tag = true;
                break;
            }

            nodeSet.add(pNode);
            pNode = pNode.next;
        }

        return tag;
    }

    //优化方法、快慢指针
//    public boolean hasCycle2(ListNode head) {
//        ListNode slow = head, fast = null;
//        if (slow != null){
//            fast = head.next;
//        }
//        while (slow != null && fast != null && slow != fast){
//            slow = slow.next;
//            if (fast.next != null){
//                fast = fast.next.next;
//            }else {
//                fast = null;
//            }
//        }
//
//        if (slow == fast){
//            return true;
//        }else {
//            return false;
//        }
//    }
}
