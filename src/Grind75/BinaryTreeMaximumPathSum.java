package Grind75;

public class BinaryTreeMaximumPathSum {
    public static void main(String[] args) {
        System.out.println("Binary Tree Maximum Path Sum");
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }



    int ans;
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

        int leftPathMax = Math.max(leftPath,0);
        int rightPathMax = Math.max(rightPath,0);

        ans = Math.max(ans,root.val+leftPathMax+rightPathMax);

        return root.val + Math.max(leftPathMax,rightPathMax);
    }
}
