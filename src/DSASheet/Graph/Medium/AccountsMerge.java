package DSASheet.Graph.Medium;


import java.util.*;

class Disjoint {
    public List<Integer> rank = new ArrayList<>();
    public List<Integer> size = new ArrayList<>();

    public List<Integer> parents = new ArrayList<>();
    public Disjoint(int size) {
        for(int i = 0;i<=size;i++){
            rank.add(0);
            parents.add(i);
        }
    }


    public int findParent(int u){
        if(parents.get(u) == u){
            return u;
        }

        int ulp = findParent(parents.get(u));
        parents.set(u,ulp);
        return parents.get(u);
    }

    public void unionByRank(int u,int v){
        int ulpU = findParent(u);
        int ulpV = findParent(v);

        if(ulpU == ulpV) return;

        int rankUlpU = rank.get(ulpU);
        int rankUlpV = rank.get(ulpV);

        if(rankUlpU < rankUlpV){
            parents.set(ulpU,ulpV);
        }else if(rankUlpV < rankUlpU){
            parents.set(ulpV,ulpU);
        }else{
            parents.set(ulpV,ulpU);
            rank.set(ulpU,rankUlpU+1);
        }
    }


    public void unionBySize(int u,int v){
        int ulpU = findParent(u);
        int ulpV = findParent(v);

        if(ulpU == ulpV) return;

        int sizeUlpU = size.get(ulpU);
        int sizeUlpV = size.get(ulpV);

        if(sizeUlpU < sizeUlpV){
            parents.set(ulpU,ulpV);
            size.set(ulpV,sizeUlpU+sizeUlpV);
        }
        else{
            parents.set(ulpV,ulpU);
            size.set(ulpU,sizeUlpU+sizeUlpV);
        }
    }
}
public class AccountsMerge {
    public static void main(String[] args) {
        System.out.println("Accounts Merge");
    }


    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int n = accounts.size();

        HashMap<String,Integer> hMap = new HashMap<>();

        Disjoint ds = new Disjoint(n);
        for(int i =0;i<n;i++){
            for(int j = 1;j<accounts.get(i).size();j++){
                String mail = accounts.get(i).get(j);
                if(!hMap.containsKey(mail)){
                    hMap.put(mail,i);
                }else{
                    ds.unionByRank(i,hMap.get(mail));
                }
            }
        }

        ArrayList<String>[] mergedMail = new ArrayList[n];
        for(int i =0;i<n;i++){
            mergedMail[i] = new ArrayList<>();
        }

        for(Map.Entry<String,Integer> it : hMap.entrySet()){
            String mail = it.getKey();
            int node = ds.findParent(it.getValue());
            mergedMail[node].add(mail);
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
