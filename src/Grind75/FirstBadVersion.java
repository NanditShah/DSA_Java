package Grind75;

public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println("First Bad Version");
    }

//    This method is already implemented by leetcode, no need to use it, I have added it because IntelliJ was giving error;
    public boolean isBadVersion(int version){
        return false;
    }
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while(start <= end){
            int mid = start - (end - start)/2;
            if(isBadVersion(mid)){
                end = mid;
            }else{
                start = mid + 1;
            }
        }

        return start;
    }
}
