package Learning.BinarySearch;

public class NextGreatestLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        if(target >= letters[end]){
            return letters[0];
        }

        while(start <= end){
            int mid = start - ((start - end)/2);
            if(target < letters[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return letters[start];
    }
}
