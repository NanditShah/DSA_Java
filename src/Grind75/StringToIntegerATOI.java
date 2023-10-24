package Grind75;

public class StringToIntegerATOI {
    public static void main(String[] args) {
        System.out.println("String to Integer (atoi)");
    }

    public int myAtoi(String s) {
        s = s.strip();
        if(s.isEmpty()) return 0;

        int sign = s.charAt(0) == '-' ? -1 : 1;

        if(s.charAt(0) == '+' || s.charAt(1) == '-') s = s.substring(1);
        int number = 0;
        for(char ch : s.toCharArray()){
            if(!Character.isDigit(ch)) break;
            number = (number * 10) + (ch - '0');

            if(sign * number > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign * number < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        return sign * number;
    }
}
