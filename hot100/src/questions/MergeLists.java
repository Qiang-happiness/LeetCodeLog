package questions;

import pojo.ListNode;

public class MergeLists {
    //以下所示方法修改了原来的两链表
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null){
            return list1 == null ? list2 : list1;
        }

        ListNode pNode1 = list1, pNode2 = list2, newList = null, tailNode = null;
        //先确定新链表的头节点
        if (pNode1.val <= pNode2.val){
            newList = pNode1;
            pNode1 = pNode1.next;
        }else {
            newList = pNode2;
            pNode2 = pNode2.next;
        }
        tailNode = newList;
        //遍历，值更小的节点加入链表
        while (pNode1 !=null && pNode2 != null){
            if (pNode1.val < pNode2.val) {
                ListNode temp = pNode1.next;
                tailNode.next = pNode1;
                tailNode = pNode1;
                tailNode.next = null;
                pNode1 = temp;
            } else {
                ListNode temp = pNode2.next;
                tailNode.next = pNode2;
                tailNode = pNode2;
                tailNode.next = null;
                pNode2 = temp;
            }
        }
        while (pNode1 != null) {
            //list1有剩余，全部插入链表
            ListNode temp = pNode1.next;
            tailNode.next = pNode1;
            tailNode = pNode1;
            tailNode.next = null;
            pNode1 = temp;
        }
        while (pNode2 != null) {
            //list2有剩余，全部插入链表
            ListNode temp = pNode2.next;
            tailNode.next = pNode2;
            tailNode = pNode2;
            tailNode.next = null;
            pNode2 = temp;
        }
        return newList;
    }
}
