package DSASheet.HashMap.Medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static void main(String[] args) {
        System.out.println("Top K Frequent Elements");
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hashMap = new HashMap<>();

        for(int num : nums){
            hashMap.put(num,hashMap.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> hashMap.get(b) - hashMap.get(a));

        for(int num : hashMap.keySet()){
            pq.add(num);
        }

        int[] ans = new int[k];
        for(int i =0;i<k;i++){
            ans[i] = pq.remove();
        }
        return ans;
    }
}
