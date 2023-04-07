package Assignments.Trees;

import java.util.*;

public class TopViewOfBinaryTree {
    public static void main(String[] args) {
        System.out.println("Top View of Binary Tree");
    }


    class Detail {
        int x;
        TreeNode node;

        public Detail(int x,TreeNode node){
            this.x = x;
            this.node = node;
        }
    }

    public ArrayList<Integer> topViewOfTree(TreeNode root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }

        Map<Integer,Integer> map = new TreeMap<>();
        Queue<Detail> detailsQueue = new LinkedList<>();

        detailsQueue.add(new Detail(0,root));

        while(!detailsQueue.isEmpty()){
            Detail nodeDetail = detailsQueue.remove();
            TreeNode node = nodeDetail.node;
            int x = nodeDetail.x;

            if(!map.containsKey(x)){
                map.put(x,node.val);
            }

            if(node.left != null){
                detailsQueue.add(new Detail(x-1,node.left));
            }

            if(node.right != null){
                detailsQueue.add(new Detail(x+1,node.right));
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            ans.add(entry.getValue());
        }

        return ans;
    }
}
