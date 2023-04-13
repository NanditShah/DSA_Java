package Assignments.Trees;

public class LowestCommonAncestorOfABinarySearchTree {
    public static void main(String[] args) {
        System.out.println("Lowest Common Ancestor of a Binary Search Tree");
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;

        if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }
}
