package DSASheet.Heap.Medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class ReorganizeString {
    public static void main(String[] args) {
        System.out.println("Reorganize String");

        System.out.println(reorganizeString("aaab"));
    }

    public static String reorganizeString(String s) {
        HashMap<Character,Integer> hMap = new HashMap<>();

        Queue<Character> heap = new PriorityQueue<>((a,b) -> hMap.get(b) - hMap.get(a));

        for(char ch : s.toCharArray()) hMap.put(ch,hMap.getOrDefault(ch,0)+1);

        for(Map.Entry<Character,Integer> entry:hMap.entrySet()) heap.add(entry.getKey());

        String res = "";
        while(!heap.isEmpty()){
            char a = heap.remove();

            if(heap.isEmpty()){
                if(hMap.get(a) > 1) return "";
                else {
                    res += (a + "");
                }
                break;
            }
            char b = heap.remove();
            res += (a + "");
            hMap.put(a,hMap.get(a)-1);
            res += (b + "");
            hMap.put(a,hMap.get(b)-1);

            if(hMap.get(a) != 0) heap.add(a);
            if(hMap.get(b) != 0) heap.add(b);
        }
        return res;
    }
}
