package Assignments.Easy;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        System.out.println("Kth Missing Positive Number");
        int ans = findKthPositive(new int[] {1,2,3,4},2);
        System.out.println(ans);
    }

    static int findKthPositive(int[] arr, int k){
        int start = 0,end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            int missing = compute(arr[mid],mid+1);
            if(missing >= k){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        if(end == -1) return k;
        return arr[end] + k - compute(arr[end],end+1);
    }

    static int compute(int actual,int expected){
        return actual - expected;
    }

}
