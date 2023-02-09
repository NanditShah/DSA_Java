package Assignments.Easy;

public class CountAsterisks {
    public static void main(String[] args) {
        System.out.println("Count Asterisks");
        System.out.println(countAsterisks("iamprogrammer"));
    }

    static int countAsterisks(String s) {
        int pipeCount = 0;
        int asterisksCount = 0;
        for(char c : s.toCharArray()){
            if(c == '|'){
                pipeCount++;
            }
            if(c == '*'){
                if(pipeCount % 2 == 0){
                    asterisksCount++;
                }
            }
        }
        return asterisksCount;
    }
}
