package Learning.Matrix;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1}};
        int[] ans = search(matrix,1);
        System.out.println(Arrays.toString(ans));
        System.out.println("Sorted Learning.Matrix");
    }

    static int[] search(int[][] matrix,int target){
        int r = 0;
        int c = matrix.length - 1;
        while(r < matrix.length){
            if(matrix[r][c] == target){
                return new int[] {r,c};
            }
            else if(matrix[r][c] < target){
                r++;
            }else{
               int foundC = binarySearch(matrix[r],target);
               if(foundC == -1){
                   return new int[] {-1,-1};
               }
               return new int[] {r,foundC};
            }
        }
        return new int[] {-1,-1};
    }

    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start - ((start - end)/2);

            if(target == arr[mid]){
                return mid;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
