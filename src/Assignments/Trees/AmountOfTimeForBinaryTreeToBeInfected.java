package Assignments.Trees;

import java.util.*;

public class AmountOfTimeForBinaryTreeToBeInfected {
    public static void main(String[] args) {
        System.out.println("Amount of Time for Binary Tree to Be Infected");
    }

    public TreeNode getParentTrack(Map<TreeNode,TreeNode> parentTrack, TreeNode root,int start){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        TreeNode startNode = null;
        while(!queue.isEmpty()){
            TreeNode node = queue.remove();

            if(node.val == start) startNode = node;

            if(node.left != null){
                parentTrack.put(node.left,node);
                queue.add(node.left);
            }
            if(node.right != null){
                parentTrack.put(node.right,node);
                queue.add(node.right);
            }
        }

        return startNode;
    }


    public int amountOfTime(TreeNode root, int start) {
        if(root == null){
            return 0;
        }

        Map<TreeNode,TreeNode> parentTrack = new HashMap<>();
        TreeNode startNode = getParentTrack(parentTrack,root,start);

        Map<TreeNode,Boolean> visited = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        int timeTaken = 0;

        visited.put(startNode,true);
        queue.add(startNode);


        while(!queue.isEmpty()){
            int size = queue.size();

            int burned = 0;
            for(int i = 0;i<size;i++){
                TreeNode node = queue.remove();

                if(node.left != null && visited.get(node.left) == null){
                    burned = 1;
                    visited.put(node.left,true);
                    queue.add(node.left);
                }
                if(node.right != null && visited.get(node.right) == null){
                    burned = 1;
                    visited.put(node.right,true);
                    queue.add(node.right);
                }
                if(parentTrack.get(node) != null && visited.get(parentTrack.get(node)) == null){
                    burned = 1;
                    visited.put(parentTrack.get(node),true);
                    queue.add(parentTrack.get(node));
                }
            }
            if(burned == 1){
                timeTaken++;
            }

        }

        return timeTaken;
    }
}
