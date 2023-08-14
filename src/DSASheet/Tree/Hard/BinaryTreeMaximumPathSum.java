package DSASheet.Tree.Hard;

import DSASheet.Tree.TreeNode;

public class BinaryTreeMaximumPathSum {
    public static void main(String[] args) {
        System.out.println("Binary Tree Maximum Path Sum");
    }

    int ans = 0;
    public int maxPathSum(TreeNode root) {
        if(root == null) return ans;
        ans = root.val;
        getAns(root);
        return ans;
    }

    public int getAns(TreeNode root){
        if(root == null) return 0;
        int leftPath = getAns(root.left);
        int rightPath = getAns(root.right);

        int leftPathMax = Math.max(leftPath,0);
        int rightPathMax = Math.max(rightPath,0);

        ans = Math.max(ans,leftPathMax+rightPathMax+root.val);
        return root.val+Math.max(leftPathMax,rightPathMax);
    }
}
