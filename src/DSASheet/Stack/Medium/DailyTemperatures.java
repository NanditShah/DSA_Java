package DSASheet.Stack.Medium;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        System.out.println("Daily Temperatures");

        int[] temps = {73,74,75,71,69,72,76,73};
        dailyTemperatures(temps);
    }


    public static int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> stk = new Stack<>();

        for(int i = temperatures.length - 1 ;i >= 0;i--){
            int temperature = temperatures[i];

            while(!stk.isEmpty() && temperature >= temperatures[stk.peek()]){
                stk.pop();
            }
            ans[i] = stk.isEmpty() ? 0 : stk.peek() - i;

            stk.push(i);
        }
        return ans;
    }
}
