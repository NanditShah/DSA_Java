package DSASheet.Graph.Medium;

import java.util.*;

public class EvaluateDivision {
    public static void main(String[] args) {
        System.out.println("Evaluate Division");
    }

    public double[] calcEquation(List<List<String>> equations, double[] values,
                                 List<List<String>> queries) {

        Map<String, Map<String,Double>> graph = new HashMap<>();
        double[] ans = new double[queries.size()+1];

        for(int i = 0;i<equations.size();i++){
            String A = equations.get(i).get(0);
            String B = equations.get(i).get(1);

            graph.putIfAbsent(A,new HashMap<>());
            graph.putIfAbsent(B,new HashMap<>());

            graph.get(A).put(B,values[i]);
            graph.get(B).put(A,1.0/values[i]);
        }

        for(int i = 0;i<queries.size();i++){
            ans[i] = bfs(graph,queries.get(i).get(0),queries.get(i).get(1));
        }

        return ans;
    }

    class Pair{
        String node;
        double multiplication;

        public Pair(String node, double multiplication) {
            this.node = node;
            this.multiplication = multiplication;
        }
    }

    public double bfs(Map<String,Map<String,Double>> graph,String src,String dest){
        if(!graph.containsKey(src) || !graph.containsKey(dest)) return -1.00;

        Set<String> hashSet = new HashSet<>();
        Queue<Pair> helperQueue = new LinkedList<>();
        helperQueue.add(new Pair(src,1));
        hashSet.add(src);

        while(!helperQueue.isEmpty()){
            Pair topPair = helperQueue.remove();
            if(topPair.node.equals(dest)){
                return topPair.multiplication;
            }

            for(String key : graph.get(topPair.node).keySet()){
                if(!hashSet.contains(key)){
                    helperQueue.add(new Pair(key,topPair.multiplication * graph.get(topPair.node).get(key)));
                }
            }

        }
        return -1.00;
    }
}
