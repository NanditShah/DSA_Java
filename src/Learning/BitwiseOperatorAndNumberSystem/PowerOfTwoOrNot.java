package Learning.BitwiseOperatorAndNumberSystem;

public class PowerOfTwoOrNot {
    public static void main(String[] args) {
        System.out.println("Check if number is power of two or not");
        System.out.println(powerOfTwoOrNot(32));
        System.out.println(powerOfTwoOrNot(25));
        System.out.println(powerOfTwoOrNot(16));
    }


    static boolean powerOfTwoOrNot(int number){
        if(number == 0){
            return false;
        }
        int ans = number & (number - 1);
        return ans == 0;
    }
}
