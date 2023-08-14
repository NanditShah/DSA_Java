package DSASheet.DFS.Medium;

public class DecodeString {
    public static void main(String[] args) {
        System.out.println("Decode String");
        System.out.println(decodeString("3[a]2[bc]"));
    }

    static int i = 0;
    public static String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        while(i < s.length() && s.charAt(i) != ']'){
            if(Character.isDigit(s.charAt(i))){
                int number = 0;
                while(i < s.length() && Character.isDigit(s.charAt(i))){
                    number = number * 10 + (s.charAt(i++) - '0');
                }
                i++;
                String r = decodeString(s);
                while(number > 0){
                    sb.append(r);
                    number--;
                }
                i++;
            }else{
                sb.append(s.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
}
