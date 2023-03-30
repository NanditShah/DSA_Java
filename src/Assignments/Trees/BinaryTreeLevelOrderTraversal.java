package Assignments.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        System.out.println("Binary Tree Level Order Traversal");
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> tranversalList = new ArrayList<>();
        if(root == null) return tranversalList;
        queue.add(root);
        while(!queue.isEmpty()){
            int totalNodesInQueue = queue.size();
            List<Integer> subList = new ArrayList<>();
            for(int i = 0;i<totalNodesInQueue;i++){
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            tranversalList.add(subList);
        }
        return tranversalList;
    }
}
