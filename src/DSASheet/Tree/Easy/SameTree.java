package DSASheet.Tree.Easy;

import DSASheet.Tree.TreeNode;

public class SameTree {
    public static void main(String[] args) {
        System.out.println("Same Tree");
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q == null) return p == q;
        return p.val == q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
