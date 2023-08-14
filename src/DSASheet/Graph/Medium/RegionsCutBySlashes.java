package DSASheet.Graph.Medium;

public class RegionsCutBySlashes {
    public static void main(String[] args) {
        System.out.println("Regions Cut By Slashes");
    }

    int[] par;

    public int findLeaderParent(int u){
        return par[u]==u ? u : (par[u]=findLeaderParent(par[u]));
    }


    public int mergeUnion(int p1, int p2) {
        if (p1 != p2) {
            par[p2] = p1;
            return 0;
        }
        return 1;
    }

    public int regionsBySlashes(String[] grid) {
        int n = grid.length;
        int N = n + 1;

        par = new int[N * N];
        for (int i = 0; i < N * N; i++) {
            if (i / N == 0 || i % N == 0 || i / N == N - 1 || i % N == N - 1) {
                par[i] = 0;
            } else {
                par[i] = i;
            }
        }

        int numberOfCycles = 1;
        for (int i = 0; i < n; i++) {
            String str = grid[i];
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (ch == '/') {
                    int p1 = findLeaderParent(i * N + j + 1);
                    int p2 = findLeaderParent((i + 1) * N + j);
                    numberOfCycles += mergeUnion(p1, p2);
                } else if (ch == '\\') {
                    int p1 = findLeaderParent(i * N + j);
                    int p2 = findLeaderParent((i + 1) * N + j + 1);
                    numberOfCycles += mergeUnion(p1, p2);
                }
            }
        }

        return numberOfCycles;
    }
}
