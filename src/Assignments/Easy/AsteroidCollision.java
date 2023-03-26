package Assignments.Easy;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        System.out.println("Asteroid Collision");
        int[] asteroidsState = asteroidCollision(new int[] {10,2,-5});
        System.out.println(Arrays.toString(asteroidsState));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int asteroid : asteroids){
            boolean addFlag = true;

            while(!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                int topElement = stack.peek();
                if (Math.abs(topElement) < Math.abs(asteroid)) {
                    stack.pop();
                } else if (Math.abs(topElement) == Math.abs(asteroid)) {
                    addFlag = false;
                    stack.pop();
                    break;
                }else{
                    addFlag = false;
                    break;
                }
            }

            if(addFlag){
                stack.push(asteroid);
            }
        }

        int[] ans = new int[stack.size()];
        int i = stack.size() - 1;
        while(!stack.isEmpty()){
            ans[i] = stack.pop();
            i--;
        }

        return ans;

    }
}
