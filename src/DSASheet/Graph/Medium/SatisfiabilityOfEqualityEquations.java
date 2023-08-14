package DSASheet.Graph.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SatisfiabilityOfEqualityEquations {
    public static void main(String[] args) {
        System.out.println("Satisfiability of Equality Equations");
        String[] equations = {"a==b","b!=a","a==b","b!=a","a==b","b!=a"};
        equationsPossible(equations);
    }

    static int[] parent = new int[26];
    public static int find(int x) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }

    public static boolean equationsPossible(String[] equations) {

        for (int i = 0; i < 26; i++) parent[i] = i;
        for (String e : equations) {
            if (e.charAt(1) == '=') {
                parent[find(e.charAt(0)- 'a')] = find(e.charAt(3) - 'a');
            }
        }
        // handle != case
        for (String e : equations) {
            if (e.charAt(1) == '!' && find(e.charAt(0) - 'a') == find(e.charAt(3) - 'a')) {
                return false;
            }
        }
        return true;
    }
}