package pojo;

import java.util.HashMap;
import java.util.Map;

class LRUCache {

    class DLinkedNode {
        int key;
        int value;
        DLinkedNode prev;
        DLinkedNode next;
        public DLinkedNode() { }
        public DLinkedNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Map<Integer, DLinkedNode> cache = new HashMap<>();
    private int size;
    private int capacity;
    private DLinkedNode head, tail;


    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        DLinkedNode node = cache.get(key);
        if (node == null) return -1;
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            //不存在，创建节点并加入头部
            node = new DLinkedNode(key, value);
            cache.put(key, node);
            addToHead(node);
            ++size;
            if (size > capacity) {
                DLinkedNode tailNode = removeTail();
                cache.remove(tailNode.key);
                --size;
            }
        } else {
            node.value = value;
            moveToHead(node);
        }
    }

    private void addToHead(DLinkedNode node) {
        node.next = head.next;
        head.next.prev = node;
        node.prev = head;
        head.next = node;
    }

    private DLinkedNode removeTail(){
        DLinkedNode node = tail.prev;
        node.prev.next = tail;
        tail.prev = node.prev;
        return node;
    }

    private void moveToHead(DLinkedNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
        head.next.prev = node;
        node.next = head.next;
        node.prev = head;
        head.next = node;
    }
}
