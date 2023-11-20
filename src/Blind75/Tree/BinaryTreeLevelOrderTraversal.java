package Blind75.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        System.out.println("Binary Tree Level Order Traversal");
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null) return ans;

        Queue<TreeNode> helperQueue = new LinkedList<>();
        helperQueue.add(root);

        while(!helperQueue.isEmpty()){
            int size = helperQueue.size();
            List<Integer> level = new ArrayList<>();
            while(size > 0){
                TreeNode topNode = helperQueue.remove();
                level.add(topNode.val);
                if(topNode.left != null) helperQueue.add(topNode.left);
                if(topNode.right != null) helperQueue.add(topNode.right);
                size --;
            }
            ans.add(level);
        }
        return ans;
    }
}
