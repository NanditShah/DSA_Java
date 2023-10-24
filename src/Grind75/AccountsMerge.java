package Grind75;

import java.util.*;

public class AccountsMerge {
    public static void main(String[] args) {
        System.out.println("Accounts Merge");
    }

    class DisjointSet{
        int n;
        List<Integer> ranks;
        List<Integer> parents;

        public DisjointSet(int n) {
            this.n = n;
            this.ranks = new ArrayList<>();
            this.parents = new ArrayList<>();

            for(int i = 0;i<n;i++){
                ranks.add(0);
                parents.add(i);
            }
        }

        public int findParent(int u){
            if(u == parents.get(u)) return u;
            int ultimateParent = findParent(parents.get(u));
            parents.set(u,ultimateParent);
            return ultimateParent;
        }

        public void unionByRank(int u,int v){
            int ultU = findParent(u);
            int ultV = findParent(v);

            int rankUltU = ranks.get(ultU);
            int rankUltV = ranks.get(ultV);

            if(rankUltU < rankUltV){
                parents.set(ultU,ultV);
            }else if(rankUltV < rankUltU){
                parents.set(ultV,ultU);
            }else{
                parents.set(ultV,ultU);
                ranks.set(ultU,rankUltU+1);
            }
        }
    }

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int n = accounts.size();

        DisjointSet ds = new DisjointSet(n);

        HashMap<String,Integer> hMap = new HashMap<>();

        for(int i = 0;i<n;i++){
            for(int j = 1;j<accounts.get(i).size();j++){
                String email = accounts.get(i).get(j);
                if(hMap.containsKey(email)){
                    ds.unionByRank(i,hMap.get(email));
                }else{
                    hMap.put(email,i);
                }
            }
        }

        ArrayList<String>[] mergedMail = new ArrayList[n];
        for(int i =0;i<n;i++){
            mergedMail[i] = new ArrayList<>();
        }

        for(Map.Entry<String,Integer> entrySet : hMap.entrySet()){
            String email = entrySet.getKey();
            int node = ds.findParent(entrySet.getValue());
            mergedMail[node].add(email);
        }

        List<List<String>> ans = new ArrayList<>();

        for(int i =0;i<n;i++){
            if(mergedMail[i].size() > 0){
                Collections.sort(mergedMail[i]);
                List<String> temp = new ArrayList<>();
                temp.add(accounts.get(i).get(0));
                for(String it : mergedMail[i]){
                    temp.add(it);
                }
                ans.add(temp);
            }
        }

        return ans;
    }
}
