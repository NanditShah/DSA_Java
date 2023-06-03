package DSASheet.Arrays.Hard;

public class FirstMissingPositive {
    public static void main(String[] args) {
        System.out.println("First Missing Positive");
    }

    public int firstMissingPositive(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length && correctIndex >= 0 && arr[i] != arr[correctIndex]){
                swap(i,correctIndex,arr);
            }else{
                i++;
            }
        }

        for(i = 0;i<arr.length;i++){
            if(arr[i] != i+1){
                return i+1;
            }
        }
        return arr.length+1;
    }

    private void swap(int i, int j, int[] arr) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
