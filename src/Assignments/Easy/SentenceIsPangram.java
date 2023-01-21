package Assignments.Easy;

public class SentenceIsPangram {
    public static void main(String[] args) {
        System.out.println("Check if the Sentence Is Pangram");
        boolean ans = checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
        System.out.println(ans);
    }

    static boolean checkIfPangram(String sentence) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        for(char c : s.toCharArray()){
            int index = sentence.indexOf(c);
            if(index == -1){
                return false;
            }
        }
        return true;
    }
}
