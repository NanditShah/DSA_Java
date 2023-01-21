package Assignments.Easy;

import java.util.Arrays;

public class ShuffleString {
    public static void main(String[] args) {
        System.out.println("Shuffle String");
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices));
    }


    static String restoreString(String s, int[] indices) {
        char[] ans = new char[indices.length];
        for(int i = 0;i<indices.length;i++){
            ans[indices[i]] = s.charAt(i);
        }
        return new String(ans);
    }
}
