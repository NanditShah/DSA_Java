package Learning.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        System.out.println("Subset of an array");
//        List<List<Integer>> subsets = getAllSubsets(new int[] {1,2,3});
//        for(List<Integer> subset: subsets){
//            System.out.println(subset);
//        }

        List<List<Integer>> subsetsDuplicatesHandled = getAllSubsetsWithDuplicates(new int[] {1,2,2});
        for(List<Integer> subset: subsetsDuplicatesHandled){
            System.out.println(subset);
        }
    }



    //    Iterative approach
    static List<List<Integer>> getAllSubsets(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<Integer>());
        for(int num : arr){
            int n = outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    static List<List<Integer>> getAllSubsetsWithDuplicates(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<Integer>());
        int start = 0;
        int end = 0;
        for(int i = 0;i<arr.length;i++){
            start = 0;
            if(i>0 && arr[i] == arr[i-1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for(int j=start;j<n;j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }

}
