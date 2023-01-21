package CyclicSort;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        System.out.println("Find the Duplicate Number");
        int[] arr = {3,1,3,4,2};
        int duplicate = findDuplicate(arr);
        System.out.println(duplicate);
    }

    static int findDuplicate(int[] nums) {
        int i = 0;
        while(i <  nums.length){
            int correctIndex = nums[i] - 1;
            if(i != correctIndex){
                if(nums[i] != nums[correctIndex]){
                    swap(nums,i,correctIndex);
                }
                else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return nums.length;
    }

    static void swap(int[] arr,int from,int to){
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }


}
