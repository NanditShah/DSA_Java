package DSASheet.TwoPointer.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PartitionLabels {
    public static void main(String[] args) {
        System.out.println("Partition Labels");
    }

    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> lastIndex = new HashMap<>();
        List<Integer> sizeList = new ArrayList<>();

        for(int i = 0;i<s.length();i++) lastIndex.put(s.charAt(i),i);

        int size = 0,end = 0;
        for(int i = 0;i<s.length();i++){
            size += 1;
            end = Math.max(end,lastIndex.get(s.charAt(i)));
            if(i == end){
                sizeList.add(size);
                size = 0;
                end = 0;
            }
        }
        return sizeList;
    }
}
