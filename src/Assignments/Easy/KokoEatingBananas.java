package Assignments.Easy;

public class KokoEatingBananas {
    public static void main(String[] args) {
        System.out.println("Koko Eating Bananas");
        int[] piles = {30,11,23,4,20};
        int ans = minEatingSpeed(piles,5);
        System.out.println(ans);
    }

    static int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = 0;
        for(int pile : piles){
            if(pile > max){
                max = pile;
            }
        }
        int start = 1;
        int end = max;

        while(start <= end){
            int speed = start - ((start - end)/2);
            int requiredHours = getRequiredHours(piles,speed);
            if(requiredHours <= h){
                end = speed - 1;
            }else{
                start = speed + 1;
            }
        }
        return start;
    }

    static int getRequiredHours(int[] piles,int givenCapacity){
        int res = 0;
        for(int pile : piles){
            res += ((pile / givenCapacity) + (((pile % givenCapacity) == 0) ? 0: 1));
        }
        return res;
    }

}
