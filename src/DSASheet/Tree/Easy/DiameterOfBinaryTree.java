package DSASheet.Tree.Easy;

import DSASheet.Tree.TreeNode;

public class DiameterOfBinaryTree {
    public static void main(String[] args) {
        System.out.println("Diameter of Binary Tree");
    }

    int height = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        getTreeDiameter(root);
        return height;
    }

    public int getTreeDiameter(TreeNode root){
        if(root == null) return 0;
        int leftHeight = getTreeDiameter(root.left);
        int rightHeight = getTreeDiameter(root.right);
        height = Math.max(height,leftHeight+rightHeight);
        return 1+Math.max(leftHeight,rightHeight);
    }
}


