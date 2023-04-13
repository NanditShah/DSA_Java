package Assignments.Trees;

public class ValidateBinarySearchTree {
    public static void main(String[] args) {
        System.out.println("Validate Binary Search Tree");
    }

    public boolean isValidBST(TreeNode root){
        if(root == null) return true;
        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean isValidBST(TreeNode root,long rangeMinVal,long rangeMaxVal) {
        if(root == null){
            return true;
        }
        if(root.val <= rangeMinVal ||  root.val >= rangeMaxVal) return false;
        return isValidBST(root.left,rangeMinVal,root.val) && isValidBST(root.right,root.val,rangeMaxVal);
    }
}
