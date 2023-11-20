package Blind75.Tree;

public class BinaryTreeMaximumPathSum {
    public static void main(String[] args) {
        System.out.println("Binary Tree Maximum Path Sum");
    }

    int ans = 0;
    public int maxPathSum(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return root.val;

        ans = root.val;

        calculateMaxPathSum(root);
        return ans;
    }

    public int calculateMaxPathSum(TreeNode root){
        if(root == null) return 0;

        int leftPath = calculateMaxPathSum(root.left);
        int rightPath = calculateMaxPathSum(root.right);

        leftPath = Math.max(leftPath,0);
        rightPath = Math.max(rightPath,0);

        ans = Math.max(ans,root.val+leftPath+rightPath);

        return root.val + Math.max(leftPath,rightPath);
    }

}
