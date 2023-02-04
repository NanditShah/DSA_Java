package BitwiseOperatorAndNumberSystem;

public class Power {
    public static void main(String[] args) {
        System.out.println("Find power of given power and base");
        System.out.println(power(3,3));
    }

    static int power(int base,int power){
        int ans = 1;
        while(power > 0){
            if((power & 1) == 1){
                ans *= base;
            }
            base  *= base;
            power = power >> 1;
        }
        return ans;
    }
}
