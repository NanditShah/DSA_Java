package DSASheet.Graph.Medium;

public class NumberOfOperationsToMakeNetworkConnected {
    public static void main(String[] args) {
        System.out.println("Number of Operations to Make Network Connected");
    }

    public int makeConnected(int n, int[][] connections) {
        Disjoint ds = new Disjoint(n);

        int extraEdges = 0;
        int components = 0;

        for(int i = 0;i<connections.length;i++){
            int u = ds.findParent(connections[i][0]);
            int v = ds.findParent(connections[i][1]);
            if(ds.findParent(u) == ds.findParent(v)){
                extraEdges++;
            }else{
                ds.unionByRank(u,v);
            }
        }

        for(int i =0;i<n;i++){
            if(ds.parents.get(i)  == i){
                components++;
            }
        }

        return extraEdges >= (components - 1) ? components - 1 : -1;
    }
}
