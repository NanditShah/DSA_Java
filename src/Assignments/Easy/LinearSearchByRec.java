package Assignments.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinearSearchByRec {
    public static void main(String[] args) {
        System.out.println("Linear search");
        int[] arr = {1,23,2,4,23,5,6,67,8,2,1,1,1,2};
        System.out.println(linearSearchByRec(arr,2,0));
        ArrayList<Integer> indices = linearSearchForAllIndicesByRec(arr,2,0);
        System.out.println(Arrays.toString(indices.toArray()));
        ArrayList<Integer> indices2 = linearSearchForAllIndicesByRec2(arr,2,0);
        System.out.println(Arrays.toString(indices2.toArray()));

    }

    static int linearSearchByRec(int[] arr,int target,int searchIndex){
        if(arr[searchIndex] == target){
            return searchIndex;
        }
        if(searchIndex == arr.length - 1){
            return -1;
        }
        return linearSearchByRec(arr,target,searchIndex+1);
    }

    static ArrayList<Integer> linearSearchForAllIndicesByRec(int[] arr,int target,int searchIndex){
        ArrayList<Integer> indices = new ArrayList<>();
        return helper(arr,target,searchIndex,indices);
    }

    static ArrayList<Integer>  helper(int[] arr,int target,int searchIndex,ArrayList<Integer> indices){
        if(arr[searchIndex] == target){
            indices.add(searchIndex);
        }
        if(searchIndex == arr.length - 1){
            return indices;
        }
        return helper(arr,target,searchIndex+1,indices);
    }

    static ArrayList<Integer> linearSearchForAllIndicesByRec2(int[] arr,int target,int searchIndex){
        ArrayList<Integer> indices = new ArrayList<>();
        if(arr[searchIndex] == target){
            indices.add(searchIndex);
        }
        if(searchIndex == arr.length - 1){
            return indices;
        }
        ArrayList<Integer> returnedIndices = linearSearchForAllIndicesByRec2(arr,target,searchIndex+1);
        indices.addAll(returnedIndices);
        return indices;
    }



}
