package BinarySearch;

public class InfiniteArrayBS {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int ans = findAns(arr,8);
        System.out.println(ans);
    }

    static int findAns(int[] arr,int target){
        int start = 0;
        int end = 1;
        while (target > arr[end]){
                int newStart = end + 1;
                end = end + (end - start + 1)*2;
                start = newStart;
        }
        return  infiniteArrBS(arr,start,end,target);
    }

    static int infiniteArrBS(int[] arr,int start,int end,int target){
        System.out.println(start+", "+end);
        while(start <= end){
            int mid = start - ((start - end)/2);

            if(target == arr[mid]){
                return mid;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

}
