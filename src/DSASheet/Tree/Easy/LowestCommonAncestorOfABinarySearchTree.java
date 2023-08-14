package DSASheet.Tree.Easy;

import DSASheet.Tree.TreeNode;

public class LowestCommonAncestorOfABinarySearchTree {
    public static void main(String[] args) {
        System.out.println("Lowest Common Ancestor of a Binary Search Tree");
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return root;
        if(root.val >= p.val && root.val <= q.val) return root;
        if(root.val > p.val && root.val > p.val) return lowestCommonAncestor(root.left,p,q);
        else return lowestCommonAncestor(root.right,p,q);
    }
}
