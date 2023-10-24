package DSASheet.TwoPointer.Striver;

import java.util.ArrayList;

public class ReversePairs {
    public static void main(String[] args) {
        System.out.println("Reverse Pairs");
    }

    public int merge(int[] nums,int start,int mid,int end){
        int count=0;
        int j = mid+1;
        for(int i=start;i<=mid;i++){
            while(j<=end && nums[i]>(2*(long)nums[j])){
                j++;
            }
            count+=j-(mid+1);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        int left=start,right=mid+1;
        while(left<=mid && right<=end){
            if(nums[left]<=nums[right]){
                arr.add(nums[left++]);
            }else{
                arr.add(nums[right++]);
            }
        }
        while(left<=mid){
            arr.add(nums[left++]);
        }
        while(right<=end){
            arr.add(nums[right++]);
        }
        for(int i=start;i<=end;i++){
            nums[i]=arr.get(i-start);
        }
        return count;
    }

    public int mergeSort(int[] nums,int start,int end){
        if(start >= end) return 0;
        int mid = (start+end)/2;
        int ans = mergeSort(nums,start,mid);
        ans += mergeSort(nums,mid+1,end);
        ans += merge(nums,start,mid,end);
        return ans;
    }

    public int reversePairs(int[] nums) {
        if(nums.length == 0) return 0;
        return mergeSort(nums,0,nums.length - 1);
    }
}
