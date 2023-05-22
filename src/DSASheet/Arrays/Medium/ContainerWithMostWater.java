package DSASheet.Arrays.Medium;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println("Container With Most Water");
    }

    public int maxArea(int[] height) {
        int start = 0,end = height.length - 1;

        int area = Integer.MIN_VALUE;
        while(start < end){
            area = Math.max(area,(end - start) * Math.min(height[start],height[end]));

            if(height[start] >= height[end]){
                end --;
            }else{
                start ++;
            }

        }
        return area;
    }
}
