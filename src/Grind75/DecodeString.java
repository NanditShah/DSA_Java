package Grind75;

public class DecodeString {
    public static void main(String[] args) {
        System.out.println("Decode String");
    }

    int  i = 0;
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();

        while(i < s.length() &&  s.charAt(i) != ']'){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int number = 0;
                while(i < s.length() && Character.isDigit(s.charAt(i))){
                    number = number * 10 + (s.charAt(i) - '0');
                    i++;
                }

//                Escaping '[' by just increment i's by 1 after number completes
                i++;

                String newString = decodeString(s);
                while(number > 0){
                    sb.append(newString);
                    number--;
                }
            }else{
                sb.append(ch);
                i++;
            }
        }

        return sb.toString();
    }
}
