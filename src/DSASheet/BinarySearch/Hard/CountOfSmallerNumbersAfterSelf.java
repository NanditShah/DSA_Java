package DSASheet.BinarySearch.Hard;

import java.util.ArrayList;
import java.util.List;

public class CountOfSmallerNumbersAfterSelf {
    public static void main(String[] args) {
        System.out.println("Count of Smaller Numbers After Self");
        int[] nums = {-1,-1};
        System.out.println(countSmaller(nums));
    }

    static class Pair {
        int index;
        int value;

        public Pair(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }

    public static List<Integer> countSmaller(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        if(nums.length == 1) ans.add(0);
        else{
            Pair[] helperArr = new Pair[nums.length];
            for(int i =0;i<nums.length;i++) {
                helperArr[i] = new Pair(i, nums[i]);
                ans.add(i,0);
            }
            mergeSort(0,nums.length - 1,helperArr,ans);
        }
        return ans;
    }

    public static void mergeSort(int start,int end,Pair[] arrToSort,List<Integer> ans){
        if(start < end){
            int mid = start + (end - start)/2;
            mergeSort(start,mid,arrToSort,ans);
            mergeSort(mid +1,end,arrToSort,ans);
            merge(start,mid,end,arrToSort,ans);
        }
    }

    public static void merge(int start,int breakpoint,int end,Pair[] arr,List<Integer> ans){
        int i = start;
        int j = breakpoint + 1;
        int k = 0;

        Pair[] tempArr = new Pair[end - start + 1];

        while(i <= breakpoint && j <= end){
            if(arr[i].value <= arr[j].value){
                tempArr[k++] = arr[j++];
            }else{
                ans.set(arr[i].index,ans.get(arr[i].index)+(end - j  + 1));
                tempArr[k++] = arr[i++];
            }
        }

        while(i<=breakpoint){
            tempArr[k++] = arr[i++];
        }

        while(j<=end){
            tempArr[k++] = arr[j++];
        }

        for(int x=start;x<=end;x++){
            arr[x] = tempArr[x-start];
        }
    }

}
