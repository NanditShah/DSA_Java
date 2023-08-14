package DSASheet.Tree.Easy;

import DSASheet.Tree.TreeNode;

public class BalancedBinaryTree {
    public static void main(String[] args) {
        System.out.println("Balanced Binary Tree");
    }

    public boolean isBalanced(TreeNode root) {
        return getTreeHeight(root) > -1;
    }

    public int getTreeHeight(TreeNode root){
        if(root == null) return 0;

        int leftHeight = getTreeHeight(root.left);
        int rightHeight = getTreeHeight(root.right);

        if(leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) return -1;
        return 1 + Math.max(leftHeight,rightHeight);
    }
}
