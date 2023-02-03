package Assignments.Easy;

public class CountTheNumberOfConsistentStrings {
    public static void main(String[] args) {
        System.out.println("Count the Number of Consistent Strings");
    }

    public int countConsistentStrings(String allowed, String[] words) {
        int ans = words.length;
        boolean[] allowedChars = new boolean[26];
        for(char allowedChar:allowed.toCharArray()){
            allowedChars[allowedChar - 'a'] = true;
        }

        for(String word : words){
            for(char toBeChecked : word.toCharArray()){
                if(!allowedChars[toBeChecked - 'a']){
                    ans --;
                    break;
                }
            }
        }
        return ans;
    }
}
