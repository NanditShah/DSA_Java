package DSASheet.Arrays.Medium;

import java.util.*;

public class InsertDeleteGetRandom {
    public static void main(String[] args) {
        System.out.println("Insert Delete GetRandom");
    }

    class RandomizedSet {

        HashMap<Integer,Integer> hMap;
        List<Integer> list;
        public RandomizedSet() {
            hMap = new HashMap<>();
            list = new ArrayList<>();
        }

        public boolean insert(int val) {
            if(hMap.containsKey(val)) return false;
            hMap.put(val,list.size());
            list.add(val);
            return true;
        }

        public boolean remove(int val) {
            if(hMap.containsKey(val) == false)
                return false;
            int ind = hMap.get(val);
            Collections.swap(list,ind,list.size()-1);
            int swappedWith = list.get(ind);
            hMap.put(swappedWith,ind);
            list.remove(list.size()-1);
            hMap.remove(val);
            return true;
        }

        public int getRandom() {
            Random random = new Random();
            int randomIndex = random.nextInt(list.size());
            return list.get(randomIndex);
        }
    }
}
