package DSASheet.Tree.Easy;

import DSASheet.Tree.TreeNode;

public class InvertBinaryTree {
    public static void main(String[] args) {
        System.out.println("Invert Binary Tree");
    }

    public TreeNode invertTree(TreeNode root) {
        TreeNode tempTreeNode = root.left;
        root.left = root.right;
        root.right = tempTreeNode;
        if(root.left != null) invertTree(root.left);
        if(root.right != null) invertTree(root.right);
        return root;
    }
}
