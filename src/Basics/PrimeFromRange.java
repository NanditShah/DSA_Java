package Basics;

import java.util.Scanner;

public class PrimeFromRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int low = sc.nextInt();
        int high = sc.nextInt();

        if(low < high){
            for(int num = low;num <= high;num++){
                if(num == 2){
                    System.out.println(num+" is a prime number");
                    continue;
                }
                for(int j = 2;j<=(num/2)+1;j++){
                    if(num % j == 0){
                        System.out.println(num+" is not a prime number");
                        break;
                    }
                    if(j == num /2){
                        System.out.println(num+" is a prime number");
                    }
                }
            }
        }else{
            System.out.println("Please enter valid range");
        }
    }
}
