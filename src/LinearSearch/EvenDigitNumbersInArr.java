package LinearSearch;

public class EvenDigitNumbersInArr {
    public static void main(String[] args) {
        int[] arr = {555,901,482,1771};
        int count = evenDigitNumCount(arr);
        System.out.println(count);
    }

    static int evenDigitNumCount(int[] arr){
        int count = 0;
        for(int element : arr){
            if(Integer.toString(element).length() % 2 == 0){
                count ++;
            }
        }
        return count;
    }
}
