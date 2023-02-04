package BitwiseOperatorAndNumberSystem;

public class Seive {
    public static void main(String[] args) {
        System.out.println("This is an optimized way to get all prime number in till given number");
        int number = 35;
        boolean[] isPrime = new boolean[number+1];
        seive(number,isPrime);
    }

//    isPrime is false then the number is prime
    static void seive(int number,boolean[] isPrime){
        for(int i =2;i*i <= number;i++){
            if(!isPrime[i]){
                for(int j = i*2;j<=number;j+=i){
                    isPrime[j] = true;
                }
            }
        }
        for(int k = 2;k<=number;k++){
            if(!isPrime[k]){
                System.out.print(k+" ");
            }
        }
    }
}
