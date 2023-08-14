package DSASheet.HashMap.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DesignHashMap {
    public static void main(String[] args) {
        System.out.println("Design HashMap");
    }

    class MyHashMap {

        int[] data;
        public MyHashMap() {
            data = new int[1000001];
            Arrays.fill(data, -1);
        }
        public void put(int key, int val) {
            data[key] = val;
        }
        public int get(int key) {
            return data[key];
        }
        public void remove(int key) {
            data[key] = -1;
        }
    }
}
