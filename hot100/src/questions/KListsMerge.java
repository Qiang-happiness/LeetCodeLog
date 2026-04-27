package questions;
import pojo.ListNode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KListsMerge {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length < 1) return null;
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                if(o1.val < o2.val) return -1;
                else {
                    return 1;
                }
            }
        });
//        priorityQueue.addAll(Arrays.asList(lists));

        for (ListNode node : lists) {
            if (node != null){
                priorityQueue.add(node);
            }
        }
        ListNode dummyNode = new ListNode(0, null);
        ListNode ptr = dummyNode;
        while (!priorityQueue.isEmpty()) {
            ListNode polled = priorityQueue.poll();
            ptr.next = polled;
            ptr = polled;
            if (polled.next != null) {
                priorityQueue.add(polled.next);
            }
        }
        return dummyNode.next;
    }
}
