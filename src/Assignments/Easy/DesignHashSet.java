package Assignments.Easy;

import java.util.LinkedList;
import java.util.List;

public class DesignHashSet {
    public static void main(String[] args) {
        System.out.println("Design HashSet");
    }

    class MyHashSet {
        private int numBuckets = 15000;
        List<Integer>[] buckets;
        public MyHashSet() {
            buckets = new LinkedList[numBuckets];
        }

        private int hashFunc(int key){
            return key % numBuckets;
        }
        public void add(int key) {
            int i = hashFunc(key);
            if(buckets[i] == null) buckets[i] = new LinkedList<>();
            if(buckets[i].indexOf(key) == -1) buckets[i].add(key);
        }

        public void remove(int key) {
            int i = hashFunc(key);
            if(buckets[i] == null) return;
            if(buckets[i].indexOf(key) != -1) buckets[i].remove(buckets[i].indexOf(key));
        }

        public boolean contains(int key) {
            int i = hashFunc(key);
            if(buckets[i] == null) return false;
            return buckets[i].indexOf(key) != -1;
        }
    }
}
