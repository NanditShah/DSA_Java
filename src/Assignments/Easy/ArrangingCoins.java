package Assignments.Easy;

public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println("Arranging Coins");
        int ans = arrangeCoins(11);
        System.out.println(ans);
    }

    static int arrangeCoins(int n) {
        int count = 0;
        int noOfCoins = 1;
        for(int i = 0;i<n;i++){
            if(noOfCoins > n){
                break;
            }
            count ++;
            n -= noOfCoins;
            noOfCoins ++;

        }
        return count;
    }
}
