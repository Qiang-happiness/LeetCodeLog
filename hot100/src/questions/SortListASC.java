package questions;

import pojo.ListNode;

public class SortListASC {
//    public ListNode sortList(ListNode head) {
//        if (head == null || head.next == null) return head;
//
//        int length = 0;
//        ListNode ptr = head;
//        while (ptr != null) {
//            length++;
//            ptr = ptr.next;
//        }
//
//        ListNode dummyHead = new ListNode(0, head);
//        for (int subLength = 1; subLength < length; subLength <<= 1) {
//            ListNode curr = dummyHead.next;
//            ListNode prev = dummyHead;
//            while (curr != null) {
//                ListNode head1 = curr;
//                for (int i = 1; i < subLength && curr.next != null; i++) {
//                    curr = curr.next;
//                }
//                ListNode head2 = curr.next;
//                curr.next = null;
//                curr = head2;
//                for (int i = 1; i < subLength && curr != null && curr.next != null; i++) {
//                    curr = curr.next;
//                }
//                ListNode next = null;
//                if (curr != null) {
//                    next = curr.next;
//                    curr.next = null;
//                }
//                ListNode merged = mergeList(head1, head2);
//                prev.next = merged;
//                while (prev.next != null) {
//                    prev = prev.next;
//                }
//                curr = next;
//            }
//        }
//        return dummyHead.next;
//    }
//0    -  1, 2,3,4,5, 6

    //递归合并
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode dummyNode = new ListNode(0, head);
        ListNode fast = dummyNode, slow = dummyNode;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(head2);
        ListNode merged = mergeList(left, right);
        return merged;
    }

    public ListNode mergeList(ListNode head1, ListNode head2) {
        if (head1 == null || head2 == null) return head1 == null ? head2 : head1;
        ListNode dummyNode = new ListNode(0);
        ListNode left = head1, right = head2, ptr = dummyNode;
        while (left != null && right != null) {
            if (left.val < right.val) {
                ptr.next = left;
                left = left.next;
            } else {
                ptr.next = right;
                right = right.next;
            }
            ptr = ptr.next;
        }

        if (left == null) {
            ptr.next = right;
        } else {
            ptr.next = left;
        }

        return dummyNode.next;
    }
}
