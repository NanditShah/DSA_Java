package DSASheet.Recursion;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaximumLengthOfAConcatenatedStringWithUniqueCharacters {
    public static void main(String[] args) {
        System.out.println("Maximum Length of a Concatenated String with Unique Characters");
    }

    public int result = 0;
    public int maxLength(List<String> arr) {
        if(arr == null ||  arr.size() == 0) return 0;
        dfs(0,"",arr);
        return result;
    }

    public void dfs(int start,String processed,List<String> arr){
        boolean isUniqueChars = isUniqueChars(processed);

        if(isUniqueChars){
            result = Math.max(result,processed.length());
        }

        if(start == arr.size() || !isUniqueChars){
            return;
        }

        for(int i = 0;i<arr.size();i++){
            dfs(i+1,processed+arr.get(i),arr);
        }
    }

    private boolean isUniqueChars(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        return true;
    }
}
