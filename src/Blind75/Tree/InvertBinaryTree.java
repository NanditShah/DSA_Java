package Blind75.Tree;

public class InvertBinaryTree {
    public static void main(String[] args) {
        System.out.println("Invert Binary Tree");
    }

    public TreeNode invertTree(TreeNode root) {
        invertTreeRec(root);
        return root;
    }

    public void invertTreeRec(TreeNode root){
        if(root == null) return;
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        invertTreeRec(root.right);
        invertTreeRec(root.left);
    }
}
