package DSASheet.Greedy.Medium;

public class GasStation {
    public static void main(String[] args) {
        System.out.println("Gas Station");
    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        for(int i = 0;i<gas.length;i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }

        if(totalGas < totalCost) return -1;

        int startIndex = 0;
        int total = 0;
        for(int i = 0;i<cost.length;i++){
            total += (gas[i] - cost[i]);

            if(total < 0){
                total = 0;
                startIndex = i+1;
            }
        }
        return startIndex;
    }
}
