package BitwiseOperatorAndNumberSystem;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        System.out.println("This uses binary search to find the sqrt of any number");
        int number = 40;
        int precision = 3;
        System.out.println(sqrt(number,precision));
    }

    static double sqrt(int number,int precision){
        double root = 0.0;
        int start = 0;
        int end = number;

        while(start <= end) {
            int mid = end - ((end - start) / 2);
            if (mid * mid == number) {
                return mid;
            } else if (mid * mid > number) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
   }
        root = end;
//        For setting precision after . for any sqrt
        double incr = 0.1;
        for(int i = 0;i<precision;i++){
            while(root * root <= number){
                root += incr;
            }

            root -= incr;
            incr /= 10;
        }
        return root;
    }
}
