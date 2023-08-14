package DSASheet.BinarySearch.Easy;

public class SqrtOfX {
    public static void main(String[] args) {
        System.out.println("Sqrt(x)");
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {
        int l = 1;
        int r = x;
        int res = 0;

        while(l <= r){
            int m = (l + (r - l)/2);
            if(m*m > x) r = m - 1;
            else if(m*m < x){
                l = m + 1;
                res = m;
            }
            else return m;
        }
        return res;

//        return (int) Math.floor(Math.pow(2,0.5 * ((Math.log(x)/Math.log(2)))));
    }

}
