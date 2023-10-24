package DSASheet.Heap.Medium;

import java.util.Arrays;
import java.util.PriorityQueue;

public class FindTheMostCompetitiveSubsequence {
    public static void main(String[] args) {
        System.out.println("Find the Most Competitive Subsequence");

        int[] ans = mostCompetitive(new int[] {3,5,2,6},3);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] mostCompetitive(int[] nums, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[0] - b[0] == 0 ? a[1] - b[1] : a[0] - b[0]);
        int n = nums.length;
        for (int i = 0; i < n-k+1; i++) q.add(new int[]{nums[i], i});
        int[] res = new int[k];
        int i = -1;
        while (!q.isEmpty() && k > 0) {
            int[] entry = q.poll();
            int idx = entry[1];
            int value = entry[0];
            if (idx > i) {
                res[res.length-k] = value;
                k--;
                i = idx;
                if (k > 0) {
                    q.add(new int[]{nums[n-k], n-k});
                }
            }
        }

        return res;
    }
}
