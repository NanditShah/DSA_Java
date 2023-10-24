package Grind75;


  // This is MountainArray's API interface.
  // You should not implement it, or speculate about its implementation
  interface MountainArray {
      public int get(int index);
      public int length();
  }

public class FindInMountainArray {
    public static void main(String[] args) {
        System.out.println("Find in Mountain Array");
    }

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = mountainArrPeak(mountainArr);
        int ans = orderAgnosticBinarySearch(mountainArr,0,peak-1,target,true);
        if(ans == -1){
            ans = orderAgnosticBinarySearch(mountainArr,peak,mountainArr.length()-1,target,false);
        }
        return ans;
    }

    static int mountainArrPeak(MountainArray arr){
        int start = 0;
        int end = arr.length() - 1;

        while(start < end){
            int mid = start - ((start - end)/2);
            if(arr.get(mid) > arr.get(mid+1)){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    static int orderAgnosticBinarySearch(MountainArray arr,int start,int end,int target,boolean isAsc){

        while(start <= end){
            int mid = start - ((start - end)/2);

            if(target == arr.get(mid)){
                return mid;
            }else if(isAsc){
                if(target < arr.get(mid)){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target < arr.get(mid)){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
