package DSASheet.TwoPointer.Medium;

public class SortColors {
    public static void main(String[] args) {
        System.out.println("Sort Colors");
    }

    public void sortColors(int[] nums) {
        int n = nums.length;
        for(int i = 0;i<n-1;i++){
            boolean swapped = false;
            for(int j = 1;j<n - i;j++){
                if(nums[j - 1] > nums[j]){
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
}
