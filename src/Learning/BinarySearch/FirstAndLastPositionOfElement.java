package Learning.BinarySearch;

import java.util.Arrays;

public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7,8, 8, 10};
        int[] ans = firstAndLastPositionOfElement(arr,7);
        System.out.println(Arrays.toString(ans));
    }

    static int[] firstAndLastPositionOfElement(int[] arr,int target){
        int[] ans = {-1,-1};
        ans[0] = bs(arr,target,true);
        if(ans[0] != -1){
            ans[1] = bs(arr,target,false);
        }
        return ans;
    }

    static int bs(int[] arr,int target,boolean findFirstOcc){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start - ((start - end)/2);

            if(target == arr[mid]){
                ans = mid;
                if(findFirstOcc){
                    end = mid - 1;

                }else{
                    start = mid + 1;
                }
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
}
