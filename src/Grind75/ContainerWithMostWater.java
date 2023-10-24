package Grind75;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println("Container With Most Water");
    }

    public int maxArea(int[] height) {

        int l = 0,r = height.length - 1;
        int maxArea = Integer.MIN_VALUE;
        while(l < r){
            if(height[l] <= height[r]){
                maxArea = Math.max(maxArea,r - l * height[l]);
                l++;
            }else{
                maxArea = Math.max(maxArea,r - l * height[r]);
                r --;
            }
        }
        return maxArea;
    }
}
