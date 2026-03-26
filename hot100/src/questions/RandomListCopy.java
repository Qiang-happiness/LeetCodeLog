package questions;

import pojo.Node;

import java.util.HashMap;
import java.util.Map;

public class RandomListCopy {
//    Map<Node, Node> map = new HashMap<>();
//    public Node copyRandomList(Node head) {
//        if (head == null) return null;
//        Node node = new Node(head.val);
//        map.put(head, node);
//        node.next = copyNext(head.next);
//        copyRandom(head, node);
//        return node;
//    }
//
//    private Node copyNext(Node head) {
//        if (head == null) {
//            return null;
//        }
//        Node node = new Node(head.val);
//        node.next = copyNext(head.next);
//        map.put(head, node);
//        return node;
//    }
//
//    private void copyRandom(Node head, Node subHead) {
//        Node pNode = head, subNode = subHead;
//        while (pNode != null) {
//            if (pNode.random == null) {
//                subNode.random = null;
//            }
//
//            subNode.random = map.get(pNode.random);
//
//            pNode = pNode.next;
//            subNode = subNode.next;
//        }
//    }

    //极简写法
    public HashMap<Node, Node> map = new HashMap<>();
    public Node copyRandomList2(Node head) {
        //递归出口
        if (head == null) return null;
        if (map.containsKey(head)) return map.get(head);

        Node node = new Node(head.val);
        map.put(head, node);

        node.next = copyRandomList2(head.next);
        node.random = copyRandomList2(head.random);

        return node;
    }
}
