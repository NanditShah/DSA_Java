package Blind75.Tree;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        System.out.println("Maximum Depth of Binary Tree");
    }

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
//        if(root.left == null && root.right == null) return 1;

        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
