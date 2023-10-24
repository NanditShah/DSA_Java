package DSASheet.TwoPointer.Striver;

public class TrappingRainWater {
    public static void main(String[] args) {
        System.out.println("Trapping Rain Water");
    }

    public int trap(int[] height) {
        int l = 0,r = height.length - 1,leftMax = 0,rightMax = 0,totalTrappedWater = 0;
        while(l < r){
            if(height[l] <= height[r]){
                if(height[l] > leftMax) leftMax= height[l];
                else totalTrappedWater += (leftMax - height[l]);
                l++;
            }else{
                if(height[r] > rightMax) rightMax= height[r];
                else totalTrappedWater += (rightMax - height[r]);
                r--;
            }
        }
        return totalTrappedWater;
    }
}
