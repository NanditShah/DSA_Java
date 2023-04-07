package Assignments.Trees;

public class LowestCommonAncestorOfABinaryTree {
    public static void main(String[] args) {
        System.out.println("Lowest Common Ancestor of a Binary Tree");
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p ==root || q == root){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        if(right == null){
            return left;
        }else if(left == null){
            return right;
        }else{
            return root;
        }
    }
}
