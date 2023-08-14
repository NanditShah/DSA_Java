package DSASheet.LinkedList.Medium;

import java.util.LinkedList;
import java.util.List;

public class DesignHashSet {
    public static void main(String[] args) {
        System.out.println("Design HashSet");
    }

    class MyHashSet {

        int totalBuckets = 15000;

        List<Integer>[] buckets;
        public MyHashSet() {
            buckets = new LinkedList[totalBuckets];
        }

        private int generateHash(int key){
            return key % totalBuckets;
        }

        public void add(int key) {
            int hash = generateHash(key);
            if(buckets[hash] == null) buckets[hash] = new LinkedList<>();
            if(buckets[hash].indexOf(key) == -1) buckets[hash].add(key);
        }

        public void remove(int key) {
            int hash = generateHash(key);
            if(buckets[hash] == null) return;
            if(buckets[hash].indexOf(key) != -1) buckets[hash].remove(buckets[hash].indexOf(key));
        }

        public boolean contains(int key) {
            int hash = generateHash(key);
            if(buckets[hash] == null) return false;
            return buckets[hash].indexOf(key) != -1;
        }
    }
}
