package DSASheet.Maths.Medium;

public class StringToIntegerATOI {
    public static void main(String[] args) {
        System.out.println("String to Integer (atoi)");
        int ansInt = myAtoi("4193 with words");
        System.out.println(ansInt);
    }

    public static int myAtoi(String s) {
        s = s.strip();

        System.out.println(s);

        if(s.isEmpty()) return 0;

        int sign = s.charAt(0) == '-' ? -1 : 1;

        if(s.charAt(0) == '-' || s.charAt(0) == '+'){
            s = s.substring(1);
        }

        long number = 0;
        for(char currChar : s.toCharArray()){
            if(!Character.isDigit(currChar)){
                break;
            }

            number = (number * 10) + currChar - '0';

            if(sign * number > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else if(sign * number < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }

        return sign* (int) number;
    }
}
