package Learning.CyclicSort;

public class FirstMissingPositive {
    public static void main(String[] args) {
        System.out.println("Missing Number");
        int[] arr = {7,8,9,11,12};
        int missingPositiveNumber = firstMissingPositive(arr);
        System.out.println(missingPositiveNumber);
    }

    static int firstMissingPositive(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }

        // case 2
        return arr.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}