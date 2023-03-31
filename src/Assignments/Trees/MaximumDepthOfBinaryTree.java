package Assignments.Trees;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        System.out.println("Maximum Depth of Binary Tree");
    }

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        return 1+Math.max(leftHeight,rightHeight);
    }
}
