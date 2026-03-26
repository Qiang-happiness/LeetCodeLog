package questions;

import pojo.ListNode;

public class KGroupReverse {
    //此方法健壮性不够好
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) {
            return head;
        }

        ListNode left = head, right = head;
        ListNode newHead = head, lastTail = null;
        boolean existHead = false;

        while (right != null) {
            for (int i = 0; i < k - 1; i++) {
                right = right.next;
                if (right == null) break;
            }

            if (right == null) break;

            if (lastTail != null) {
                lastTail.next = right;
            }

            if (!existHead) {
                newHead = right;
                existHead = true;
            }

            ListNode lTemp = left.next, rTemp = right.next, newLeft = right.next;
            lastTail = left;
            while (left != newLeft) {
                left.next = rTemp;
                rTemp = left;
                left = lTemp;
                lTemp = lTemp == null ? null : lTemp.next;
            }
            right = left;
        }
        return newHead;
    }

    //递归解法
    public ListNode reverseKGroup2(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode pre = head, cur = pre.next;
        int index = 0;
        while (++index < k && cur != null) {
            pre.next = cur.next;
            cur.next = head;
            head = cur;
            cur = pre.next;
        }
        if (index < k) {
            return reverseKGroup2(head, index);
        }
        pre.next = reverseKGroup2(cur, k);
        return head;
    }
}
