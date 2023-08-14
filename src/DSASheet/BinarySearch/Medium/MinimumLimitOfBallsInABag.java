package DSASheet.BinarySearch.Medium;

public class MinimumLimitOfBallsInABag {
    public static void main(String[] args) {
        System.out.println("Minimum Limit of Balls in a Bag");
    }

    public int minimumSize(int[] nums, int maxOperations) {

        int left = 0;
        int right = 0;

        for (int num : nums) {
            right = Math.max(right, num);
        }

        int res = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canBeMin(nums, mid, maxOperations)) {
                res = mid;
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return res;
    }

    private boolean canBeMin(int[] nums, int mid, int maxOperations) {
        if (mid == 0) return false;
        int operations = 0;
        for (int num : nums) {
            if (num > mid) {
                operations+= (num-1) / mid;
            }
        }
        return operations<=maxOperations;
    }
}
