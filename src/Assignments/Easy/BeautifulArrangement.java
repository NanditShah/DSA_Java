package Assignments.Easy;

public class BeautifulArrangement {
    public static void main(String[] args) {
        System.out.println("Beautiful Arrangement");
        System.out.println(countArrangement(2));
    }

    static int countArrangement(int n) {
        int[] nums = new int[n+1];
        int result = findBeautifulArrangementCounts(nums,1,n);
        return result;
    }
    static int findBeautifulArrangementCounts(int[] nums,int value,int n){
        if(value > n){
            return 1;
        }
        int count = 0;
        for(int i =1;i<=n;i++){
            if(nums[i] == 0 && (value % i == 0 || i % value == 0)){
                nums[i] = value;
                count += findBeautifulArrangementCounts(nums,value+1,n);
                nums[i] = 0;
            }
        }
        return count;
    }
}
