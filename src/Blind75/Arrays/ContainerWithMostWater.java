package Blind75.Arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println("Container With Most Water");
    }

    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0, right = n - 1;

        int maxArea = Integer.MIN_VALUE;
        while(left < right){
            int distance = right - left;
            if(height[left] < height[right]){
                maxArea = Math.max(height[left] * distance,maxArea);
                left ++;
            }else{
                maxArea = Math.max(height[right] * distance,maxArea);
                right --;
            }
        }
        return maxArea;
    }
}
