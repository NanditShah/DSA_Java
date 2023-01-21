package Assignments.Easy;

public class SortingtheSentence {
    public static void main(String[] args) {
        System.out.println("Sorting the Sentence");
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    static String sortSentence(String s) {
        String[] splittedArr = s.split(" ");
        int n = splittedArr.length;
        String[] ans = new String[splittedArr.length];
        int  i = 0;
        while(i < n){
            char lastChar = splittedArr[i].charAt(splittedArr[i].length() - 1);
            int correctIndex = (lastChar - '0') - 1;
            if(i != correctIndex){
                swap(splittedArr,i,correctIndex);
            }else{
                i++;
            }
        };

        for(int j =0;j<splittedArr.length;j++){
            splittedArr[j] = splittedArr[j].substring(0,splittedArr[j].length()-1);
        }
        return String.join(" ",splittedArr);
    }

    static void swap(String[] arr,int from,int to){
        String temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
}
