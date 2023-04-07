package Assignments.Trees;

public class SymmetricTree {
    public static void main(String[] args) {
        System.out.println("Symmetric Tree");
    }

    public boolean isSymmetric(TreeNode root) {
        return root == null || identifySymmetric(root.left,root.right);
    }

    private boolean identifySymmetric(TreeNode left, TreeNode right) {
        if(left == null || right == null){
            return left == right;
        }

        if(left.val != right.val) return false;

        return identifySymmetric(left.left,right.right) && identifySymmetric(left.right,right.left);
    }
}
