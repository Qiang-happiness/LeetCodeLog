package questions;
import pojo.ListNode;

public class ListReverse {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        ListNode pNode = head, reversedList = null;

        while (pNode != null){
            reversedList = new ListNode(pNode.val, reversedList);
            pNode = pNode.next;
        }

        return reversedList;
    }
}
