package DSASheet.Arrays.Hard;

import java.util.Map;
import java.util.Stack;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        System.out.println("Largest Rectangle in Histogram");
    }

    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stk = new Stack<>();
        int maxArea = 0;

        stk.add(0);
        for(int i =1;i<heights.length;i++){
            while(!stk.isEmpty() && heights[i] < heights[stk.peek()]){
                maxArea = getMaxArea(heights,stk,maxArea,i);
            }
            stk.push(i);
        }

        int i = heights.length;
        while(!stk.isEmpty()){
            maxArea = getMaxArea(heights,stk,maxArea,i);
        }

        return maxArea;
    }

    private int getMaxArea(int[] heights,Stack<Integer> stack,int maxArea,int index){
        int area;
        int poppedElement = stack.pop();
        if(stack.isEmpty()){
            area = heights[poppedElement]*index;
        }else{
            area = heights[poppedElement]*(index - 1 - stack.peek());
        }
        return Math.max(maxArea,area);
    }
}
