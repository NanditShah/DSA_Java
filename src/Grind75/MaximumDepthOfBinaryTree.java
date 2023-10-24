package Grind75;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        System.out.println("Maximum Depth of Binary Tree");
    }

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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return getMaxHeight(root);
    }

    public int getMaxHeight(TreeNode root){
        if(root == null) return 0;
        int leftMaxHeight = getMaxHeight(root.left);
        int rightMaxHeight = getMaxHeight(root.right);

        return 1+Math.max(leftMaxHeight,rightMaxHeight);
    }
}
