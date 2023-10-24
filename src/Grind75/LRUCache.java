package Grind75;

import java.util.HashMap;

public class LRUCache {
    public static void main(String[] args) {
        System.out.println("LRU Cache");
    }


    class Node{
        int key, val;
        Node prev,next;
        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }


        int capacity;
        HashMap<Integer,Node> cache;
        Node head = new Node(-1,-1);
        Node tail = new Node(-1,-1);

        public LRUCache(int capacity) {
            this.capacity = capacity;
            cache = new HashMap<>();
            head.next = tail;
            tail.prev = head;
        }

        public void removeNode(Node nodeToRemove){
            Node prevv = nodeToRemove.prev;
            Node nextt = nodeToRemove.next;

            prevv.next = nextt;
            nextt.prev = prevv;
        }

        public Node addNode(int key, int val){
            Node tempNode = head.next;

            Node newNode = new Node(key, val) ;
            newNode.prev = head;
            newNode.next = tempNode;

            head.next = newNode;
            tempNode.prev = newNode;
            return newNode;
        }

        public int get(int key) {
            if(cache.containsKey(key)){
                Node ansNode = cache.get(key);
                this.removeNode(ansNode);
                Node newNode = this.addNode(key,ansNode.val);
                cache.remove(key);
                cache.put(key,newNode);
                return ansNode.val;
            }
            return -1;
        }

        public void put(int key, int value) {
            if(cache.containsKey(key)){
                Node curr = cache.get(key);
                cache.remove(key);
                removeNode(curr);
            }
            if (cache.size() == capacity) {
                cache.remove(tail.prev.key);
                removeNode(tail.prev);
            }

            Node newNode = addNode(key, value);
            cache.put(key,newNode);
        }
}
