package questions;

import pojo.ListNode;

import java.util.ArrayList;

public class PalindromeList {
    public boolean isPalindrome(ListNode head) {
        int listLength = 0;
        ListNode pNode = head;
        ArrayList<Integer> values = new ArrayList<>();

        while (pNode != null){
            listLength++;
            values.add(pNode.val);
            pNode = pNode.next;
        }

        int left = 0, right = listLength - 1;
        while (left <= right){
            if (!values.get(left).equals(values.get(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
