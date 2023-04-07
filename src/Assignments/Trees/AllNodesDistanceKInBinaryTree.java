package Assignments.Trees;

import java.util.*;

public class AllNodesDistanceKInBinaryTree {
    public static void main(String[] args) {
        System.out.println("All Nodes Distance K in Binary Tree");
    }

    public void getParentTrack(Map<TreeNode,TreeNode> parentTrack,TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode node = queue.remove();

            if(node.left != null){
                parentTrack.put(node.left,node);
                queue.add(node.left);
            }
            if(node.right != null){
                parentTrack.put(node.right,node);
                queue.add(node.right);
            }
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }
        Map<TreeNode,TreeNode> parentTrack = new HashMap<>();
        getParentTrack(parentTrack,root);

        Map<TreeNode,Boolean> visited = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        int travelledDistance = 0;

        visited.put(target,true);
        queue.add(target);

        while(!queue.isEmpty()){
            int size = queue.size();

            if(travelledDistance == k) break;

            travelledDistance++;
            for(int i = 0;i<size;i++){
                TreeNode node = queue.remove();

                if(node.left != null && visited.get(node.left) == null){
                    visited.put(node.left,true);
                    queue.add(node.left);
                }
                if(node.right != null && visited.get(node.right) == null){
                    visited.put(node.right,true);
                    queue.add(node.right);
                }
                if(parentTrack.get(node) != null && visited.get(parentTrack.get(node)) == null){
                    visited.put(parentTrack.get(node),true);
                    queue.add(parentTrack.get(node));
                }
            }
        }

        while(!queue.isEmpty()){
            ans.add(queue.remove().val);
        }

        return ans;
    }
}
