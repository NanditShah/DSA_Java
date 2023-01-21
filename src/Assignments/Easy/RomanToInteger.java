package Assignments.Easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println("Roman to Integer");
        System.out.println(romanToInt("I"));
    }

    static int romanToInt(String s) {
        Map<String,Integer> romanMap = new HashMap<>();
        romanMap.put("I",1);
        romanMap.put("V",5);
        romanMap.put("X",10);
        romanMap.put("L",50);
        romanMap.put("C",100);
        romanMap.put("D",500);
        romanMap.put("M",1000);

        String[] chars = s.split("");
        int result = romanMap.get(chars[chars.length - 1]);

        for(int i = chars.length - 2;i>=0;i--){
            int number = romanMap.get(chars[i]);
            int prevNumber = romanMap.get(chars[i+1]);
            if(number < prevNumber){
                result -= number;
            }
            else{
                result += number;
            }
        }
        return result;
    }
}
