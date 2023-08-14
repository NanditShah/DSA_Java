package DSASheet.Tree.Easy;

import DSASheet.Tree.TreeNode;

public class PathSum {
    public static void main(String[] args) {
        System.out.println("Path Sum");
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return helperToGetTargetSum(root,targetSum,0);
    }

    public boolean helperToGetTargetSum(TreeNode root,int targetSum,int currentSum){
        if(root == null)
            return false;
        if(root.left == null && root.right == null){
            currentSum = currentSum + root.val;
            if(currentSum == targetSum)
                return true;
        }
        return helperToGetTargetSum(root.left, targetSum, currentSum + root.val) || helperToGetTargetSum(root.right, targetSum, currentSum + root.val);
    }
}
