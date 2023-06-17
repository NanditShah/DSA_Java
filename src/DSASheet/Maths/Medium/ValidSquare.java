package DSASheet.Maths.Medium;

import java.util.HashSet;

public class ValidSquare {
    public static void main(String[] args) {
        System.out.println("Valid Square");
        int[] p1 = {0,0};
        int[] p2 = {1,1};
        int[] p3 = {1,0};
        int[] p4 = {0,12};

        System.out.println(validSquare(p1,p2,p3,p4));
    }

    public static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        HashSet<Integer> distSet = new HashSet<>();

        int[][] dist = {p1,p2,p3,p4};

        for(int i =0;i<dist.length;i++){
            for(int j = i+1;j<dist.length;j++){
                distSet.add(calculateLength(dist[i],dist[j]));
            }
        }

        return !distSet.contains(0) && distSet.size() == 2;
    }

    private static int calculateLength(int[] p1, int[] p2) {
        return (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
    }
}
