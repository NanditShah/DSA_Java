package Grind75;

public class TrappingRainWater {
    public static void main(String[] args) {
        System.out.println("Trapping Rain Water");
        System.out.println(trap(new int[] {4,2,0,3,2,5}));
    }

    public static int trap(int[] height) {
        int l = 0,r = height.length - 1,leftMax = 0,rightMax = 0;
        int totalTrappedWater = 0;
        while(l < r){
            if(height[l] <= height[r]){
                if(leftMax < height[l]) leftMax = height[l];
                else totalTrappedWater += (leftMax - height[l]);
                l++;
            }else{
                if(rightMax < height[r]) rightMax = height[r];
                else totalTrappedWater += (rightMax - height[r]);
                r--;
            }
        }
        return totalTrappedWater;
    }
}
