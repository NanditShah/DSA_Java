package Assignments.Graphs;

public class FloydWarshallAlgorithm {
    public static void main(String[] args) {
        System.out.println("Floyd Warshall Algorithm");

        int V = 4;
        int[][] adjMatrix = new int[V][V];

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                adjMatrix[i][j] = -1;
            }
        }

        adjMatrix[0][1] = 2;
        adjMatrix[1][0] = 1;
        adjMatrix[1][2] = 3;
        adjMatrix[3][0] = 3;
        adjMatrix[3][1] = 5;
        adjMatrix[3][2] = 4;
        
        shortest_distance(adjMatrix);

        for(int i =0;i<V;i++){
            for(int j = 0;j<V;j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void shortest_distance(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = (int)(1e9);
                }
                if (i == j) matrix[i][j] = 0;
            }
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = Math.min(matrix[i][j],
                            matrix[i][k] + matrix[k][j]);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == (int)(1e9)) {
                    matrix[i][j] = -1;
                }
            }
        }
    }
}
