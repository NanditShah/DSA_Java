package DSASheet.Strings.Medium;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        System.out.println("Reverse Words in a String");
        String reverseWordsString = reverseWords("the sky is blue");
        System.out.println("'"+reverseWordsString+"'");
    }

    public static String reverseWords(String s) {
        s = s.trim();
        String[] splittedStr = s.split(" ");
        String ans = "";
        for(int i =splittedStr.length - 1;i>= 0;i--){
            if(splittedStr[i].trim().length() > 0){
                ans += splittedStr[i];
                if(i != 0){
                    ans += " ";
                }
            }
        }
        return ans;
    }
}
