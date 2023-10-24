package Grind75;

public class RotateArray {
    public static void main(String[] args) {
        System.out.println("Rotate Array");
    }

    public void rotate(int[] nums, int k) {
        if(nums.length == 1 || k == nums.length) return;

        int[] copy = new int[nums.length];
        System.arraycopy(nums, 0, copy, 0, nums.length);

        int actualK = k % nums.length;

        System.arraycopy(copy, nums.length - actualK, nums, 0, actualK);
        System.arraycopy(copy, 0, nums, actualK, nums.length - actualK);
    }
}
