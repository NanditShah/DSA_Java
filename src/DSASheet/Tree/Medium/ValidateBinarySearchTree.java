package DSASheet.Tree.Medium;

import DSASheet.Tree.TreeNode;

public class ValidateBinarySearchTree {
    public static void main(String[] args) {
        System.out.println("Validate Binary Search Tree");
    }

    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root,long minVal,long maxVal){
        if(root == null) return true;
        if(root.val <= minVal || root.val >= maxVal) return false;
        return isValidBST(root.left,minVal,root.val) && isValidBST(root.right,root.val, maxVal);
    }
}
