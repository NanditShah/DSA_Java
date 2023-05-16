package Learning.CyclicSort;

public class MissingNumber {
        public static void main(String[] args) {
            System.out.println("Missing Number");
            int[] arr = {3,0,1};
            int missingNumber = missingNumber(arr);
            System.out.println(missingNumber);
        }

        static int missingNumber(int[] arr){
            int n = arr.length;
            int i = 0;

    //        Sorted First
            while(i < n){
                int correctIndex = arr[i];
                if(arr[i] < arr.length &&  arr[i] != arr[correctIndex]){
                    swap(arr,i,correctIndex);
                }else{
                    i++;
                }
            }


    //        Searching missing element
            i = 0;
            for(int num:arr){
                if(arr[i] != i){
                    return i;
                }
                i++;
            }

            return n;
        }

        static void swap(int[] arr,int from,int to){
            int temp = arr[from];
            arr[from] = arr[to];
            arr[to] = temp;
        }

}
