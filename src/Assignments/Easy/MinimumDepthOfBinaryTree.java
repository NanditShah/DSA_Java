package Assignments.Easy;

import DSASheet.Tree.TreeNode;

public class MinimumDepthOfBinaryTree {
    public static void main(String[] args) {
        System.out.println("Minimum Depth of Binary Tree");
    }

    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        return getMinDepth(root);
    }

    public int getMinDepth(TreeNode root){
        if(root == null) return 0;
        int leftMinDepth = getMinDepth(root.left);
        int rightMinDepth = getMinDepth(root.right);
        if(root.left != null && root.right != null){
            return Math.min(leftMinDepth,rightMinDepth)+1;
        }
        return Math.max(leftMinDepth,rightMinDepth)+1;
    }
}
