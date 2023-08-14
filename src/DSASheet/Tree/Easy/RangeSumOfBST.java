package DSASheet.Tree.Easy;

import DSASheet.Tree.TreeNode;

public class RangeSumOfBST {
    public static void main(String[] args) {
        System.out.println("Range Sum of BST");
    }

    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;
        if(root.val >= low && root.val <= high) {
            return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        }else if(root.val < low){
            return rangeSumBST(root.right,low,high);
        }else{
            return rangeSumBST(root.left,low,high);
        }
    }
}
