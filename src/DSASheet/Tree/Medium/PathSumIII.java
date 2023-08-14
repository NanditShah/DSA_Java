package DSASheet.Tree.Medium;

import DSASheet.Tree.TreeNode;

public class PathSumIII {
    public static void main(String[] args) {
        System.out.println("Path Sum III");
    }

    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        return countPaths(root,targetSum) + pathSum(root.left,targetSum) + pathSum(root.right,targetSum);
    }

    public int countPaths(TreeNode root,int targetSum){
        if(root == null) return 0;
        return (targetSum - root.val == 0 ? 1 : 0) +
                countPaths(root.left,targetSum - root.val) +
                countPaths(root.right,targetSum - root.val);
    }
}
