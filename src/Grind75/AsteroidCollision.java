package Grind75;

import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        System.out.println("Asteroid Collision");
    }

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> afterCollision = new Stack<>();
        for(int asteroid : asteroids){
            boolean addIn = true;

            while(!afterCollision.isEmpty() && asteroid < 0 && afterCollision.peek() > 0){
                int topAsteroid = afterCollision.peek();
                if(Math.abs(topAsteroid) < Math.abs(asteroid)){
                    afterCollision.pop();
                }else if(Math.abs(topAsteroid) == Math.abs(asteroid)){
                    addIn = false;
                    afterCollision.pop();
                    break;
                }else{
                    addIn = false;
                    break;
                }
            }
            if(addIn) afterCollision.add(asteroid);
        }

        int[] ans = new int[afterCollision.size()];
        int i = afterCollision.size() - 1;
        while(!afterCollision.isEmpty()){
            ans[i] = afterCollision.pop();
            i--;
        }
        return ans;
    }
}
