package Assignments.Easy;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        System.out.println("Assign Cookies");
        int[] g = {1,2,3};
        int[] s = {1,1};
        int ans = findContentChildren(g,s);
        System.out.println(ans);
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int count = 0;
        int i = g.length - 1;
        int j = s.length - 1;

//            for(int i = g.length - 1; i >= 0;i--){
        while(i >= 0 && j >= 0){
        if(g[i] <= s[j]) {
            count++;
            j--;
        }
        i--;
            }

        return count;
    }
}
