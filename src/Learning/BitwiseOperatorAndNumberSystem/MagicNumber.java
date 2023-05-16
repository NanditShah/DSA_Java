package Learning.BitwiseOperatorAndNumberSystem;

public class MagicNumber {
    public static void main(String[] args) {
        System.out.println("Ith Magic number ");
        System.out.println(ithMagicNumber(5));
    }

    static int ithMagicNumber(int i){
        int ans = 0;
        int pow = 1;
        while(i > 0){
            ans += (i & 1)*Math.pow(5,pow);
            pow ++;
            i = i >> 1;
        }
        return ans;
    }
}


// No of digits in base b representation of any number
// numOfDigits = int(logb(n)) + 1
// logb(n) = log n to the base b