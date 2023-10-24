package Grind75;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {

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
        System.out.println("Binary Tree Right Side View");
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        if(root == null) return ans;

        Queue<TreeNode> helperQueue = new LinkedList<>();
        helperQueue.add(root);

        while(!helperQueue.isEmpty()){
            int size = helperQueue.size();
            while(size > 0){
                TreeNode topNode = helperQueue.remove();
                if(size == 1){
                    ans.add(topNode.val);
                }
                if(topNode.left != null) helperQueue.add(topNode.left);
                if(topNode.right != null) helperQueue.add(topNode.right);
                size--;
            }
        }
        return ans;
    }
}
