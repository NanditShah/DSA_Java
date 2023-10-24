package Assignments.Easy;

public class DecodedStringAtIndex {
    public static void main(String[] args) {
        System.out.println("Decoded String at Index");
    }

    public String decodeAtIndex(String s, int k) {

        long length = 0;
        int i = 0;


        while(length < k){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int noOfTimes = ch - '0';
                length *= noOfTimes;
            }else{
                length++;
            }
            i++;
        }

        for(int j = i - 1;j>= 0;j++){
            char ch = s.charAt(j);
            if(Character.isDigit(ch)){
                int noOfTimes = ch - '0';
                length /= noOfTimes;
                k %= length;
            }else{
                if(k == 0 || k == length){
                    return Character.toString(s.charAt(j));
                }
                length--;
            }
        }
        return "";
    }
}
