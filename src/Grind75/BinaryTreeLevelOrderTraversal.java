package Grind75;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

 public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

    public static void main(String[] args) {
        System.out.println("Binary Tree Level Order Traversal");
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ansList = new ArrayList<>();
        if(root == null) return ansList;
        Queue<TreeNode> helperQueue = new LinkedList<>();
        helperQueue.add(root);

        while(!helperQueue.isEmpty()){
            int size = helperQueue.size();
            List<Integer> levelAns = new ArrayList<>();
            while(size > 0){
                TreeNode topValue = helperQueue.remove();
                if(topValue.left != null) helperQueue.add(topValue.left);
                if(topValue.right != null) helperQueue.add(topValue.right);
                size --;
                levelAns.add(topValue.val);
            }
            ansList.add(levelAns);
        }

        return ansList;
    }
}
