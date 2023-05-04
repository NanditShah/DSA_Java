package Assignments.Graphs;

import Assignments.Graphs.Disjoint.Disjoint;

import java.util.*;

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
                    ds.unionBySize(hMap.get(mail),i);
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
