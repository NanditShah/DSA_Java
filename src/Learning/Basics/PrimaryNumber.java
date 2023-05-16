package Learning.Basics;

import java.util.*;

public class PrimaryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumbers = sc.nextInt();

        for(int i = totalNumbers;i>0;i--){
            int numberToCheck = sc.nextInt();
            if(numberToCheck == 2){
                System.out.println(numberToCheck+" is a prime number");
                continue;
            }
            for(int j = 2;j<=numberToCheck/2;j++){
                if(numberToCheck % j == 0){
                    System.out.println(numberToCheck+" is not a prime number");
                    break;
                }
                if(j == numberToCheck /2){
                    System.out.println(numberToCheck+" is a prime number");
                }
            }
        }
    }
}
