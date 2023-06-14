package DSASheet.Strings.Easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println("Roman to Integer");
    }

    public int romanToInt(String s) {
        Map<Character,Integer> romanMap = new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);

        char[] charArr = s.toCharArray();

        int result = romanMap.get(charArr[charArr.length - 1]);

        for(int i = charArr.length - 2;i>= 0;i--){
            int number = romanMap.get(charArr[i]);
            int prevNumber = romanMap.get(charArr[i+1]);

            if(prevNumber > number) result -= number;
            else result += number;
        }
        return result;
    }
}
