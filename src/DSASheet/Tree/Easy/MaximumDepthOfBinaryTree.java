package DSASheet.Tree.Easy;

import DSASheet.Tree.TreeNode;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        System.out.println("Maximum Depth of Binary Tree");
    }

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth,rightDepth)+1;
    }
}
