package DSASheet.Graph.Medium;

public class FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance {
    public static void main(String[] args) {
        System.out.println("Find the City With the Smallest Number of Neighbors at a Threshold Distance");
        int[][] array = {
                {0, 1, 3},
                {1, 2, 1},
                {1, 3, 4},
                {2, 3, 1}
        };
        int distanceThreshold = 4;
        int city = findTheCity(4,array,distanceThreshold);
        System.out.println(city);
    }

    public static int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] distArr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                distArr[i][j] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            distArr[u][v] = wt;
            distArr[v][u] = wt;
        }

        for (int i = 0; i < n; i++) distArr[i][i] = 0;
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (distArr[i][k] == Integer.MAX_VALUE ||
                            distArr[k][j] == Integer.MAX_VALUE)
                        continue;
                    distArr[i][j] = Math.min(distArr[i][j], distArr[i][k] + distArr[k][j]);
                }
            }
        }

        int cntCity = n;
        int cityNo = -1;
        for (int city = 0; city < n; city++) {
            int cnt = 0;
            for (int adjCity = 0; adjCity < n; adjCity++) {
                if (distArr[city][adjCity] <= distanceThreshold)
                    cnt++;
            }

            if (cnt <= cntCity) {
                cntCity = cnt;
                cityNo = city;
            }
        }
        return cityNo;
    }
}
