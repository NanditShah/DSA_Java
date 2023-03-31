package Assignments.Trees;

public class BalancedBinaryTree {
    public static void main(String[] args) {
        System.out.println("Balanced Binary Tree");
    }

    public boolean isBalanced(TreeNode root) {
        int treeHeight = getTreeHeight(root);
        return treeHeight > -1;
    }


    public int getTreeHeight(TreeNode node){
        if(node == null) return 0;

        int leftHeight = getTreeHeight(node.left);
        int rightHeight = getTreeHeight(node.right);

        if(leftHeight == -1 || rightHeight == -1 || (Math.abs(leftHeight - rightHeight) > 1)){
            return -1;
        }
        return Math.max(leftHeight,rightHeight)+1;
    }
}
