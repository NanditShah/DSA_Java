package LinearSearch;

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] accounts = {{2, 8, 7},{
            7, 1, 3
        },{
            1, 9, 5
        }};
        int maxWealth = maximumWealth(accounts);
        System.out.println(maxWealth);
    }

    static int arrSum(int[] arr){
        int sum = 0;
        for(int element : arr){
            sum += element;
        }
        return sum;
    }

    static int maximumWealth(int[][] accounts){
        int maxWealth = 0;
        for(int[] person : accounts){
            int totalWealth = arrSum(person);
            if(totalWealth > maxWealth){
                maxWealth = totalWealth;
            }
        }
        return maxWealth;
    }
}
