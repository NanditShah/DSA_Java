package DSASheet.Stack.Medium;

import java.util.Map;
import java.util.Stack;

public class MinimumCostTreeFromLeafValues {
    public static void main(String[] args) {
        System.out.println("1130. Minimum Cost Tree From Leaf Values");
    }

    public int mctFromLeafValues(int[] arr) {
        int ans = 0;
        Stack<Integer> stk = new Stack<>();

        for(int node : arr){
            while(!stk.isEmpty() && stk.peek() <= node){
                int topValue = stk.pop();

                if(!stk.isEmpty()){
                    ans += topValue * Math.min(stk.peek(),node);
                }else{
                    ans += (topValue * node);
                }
            }
            stk.push(node);
        }

        int y = stk.pop();

        while(!stk.isEmpty()){
            int z = stk.pop();
            ans += (y*z);
            y = z;
        }
        return ans;
    }
}
