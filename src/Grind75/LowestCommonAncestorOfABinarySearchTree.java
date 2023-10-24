package Grind75;

public class LowestCommonAncestorOfABinarySearchTree {
    public static void main(String[] args) {
        System.out.println("Lowest Common Ancestor of a Binary Search Tree");
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val > q.val){
            return lowestCommonAncestor(root,q,p);
        }else{
            if(root == null) return root;
            if(p.val <= root.val && q.val >= root.val) return root;
            else if(p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left,p,q);
            else return lowestCommonAncestor(root.left,p,q);
        }
    }
}
