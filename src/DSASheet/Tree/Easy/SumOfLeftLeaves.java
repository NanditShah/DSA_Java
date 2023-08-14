package DSASheet.Tree.Easy;

import DSASheet.Tree.TreeNode;

public class SumOfLeftLeaves {
    public static void main(String[] args) {
        System.out.println("Sum of Left Leaves");
    }

    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left != null && root.left.left == null && root.left.right == null){
            return root.left.val + sumOfLeftLeaves(root.right);
        }
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}
