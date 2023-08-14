package DSASheet.Tree.Easy;

import DSASheet.Tree.TreeNode;

public class SymmetricTree {
    public static void main(String[] args) {
        System.out.println("Symmetric Tree");
    }

    public boolean isSymmetric(TreeNode root) {
        return root == null || checkForSymmetric(root.left,root.right);
    }

    public boolean checkForSymmetric(TreeNode left,TreeNode right){
        if(left == null || right == null) return left == right;
        if(left.val != right.val) return false;
        return checkForSymmetric(left.left,right.right) && checkForSymmetric(left.right,right.left);
    }
}
