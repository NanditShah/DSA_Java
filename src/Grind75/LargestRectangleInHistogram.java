package Grind75;

import java.util.Stack;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        System.out.println("Largest Rectangle in Histogram");
    }

    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int left[] = new int[n];
        int right[] = new int[n];
        Stack<Integer> s = new Stack<>();


        for(int i=0;i<heights.length;i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i] ){
                s.pop();
            }
            if(s.isEmpty()){
                left[i] = -1;
            }
            else{
                left[i] = s.peek();
            }

            s.push(i);
        }

        s = new Stack<>();
        for(int i=heights.length-1; i>=0; i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i] ){
                s.pop();
            }
            if(s.isEmpty()){
                right[i] = heights.length;
            }
            else{
                right[i] = s.peek();
            }

            s.push(i);
        }
        int large = 0;
        for(int i=0; i<heights.length; i++){
            int height = heights[i];
            int width = right[i] -left[i]-1;
            int curr = height * width;
            large = Math.max(curr, large);
        }

        return large;

    }
}
