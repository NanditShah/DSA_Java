package DSASheet.Tree.Easy;

import DSASheet.Tree.TreeNode;

public class MinimumAbsoluteDifferenceInBST {
    public static void main(String[] args) {
        System.out.println("Minimum Absolute Difference in BST");
    }

    int last = Integer.MIN_VALUE / 2;
    int ans = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return ans;
    }

    public void inOrder(TreeNode node){
        if(node.left != null) inOrder(node.left);
        ans = Math.min(ans, node.val - last);
        last = node.val;
        if(node.right != null) inOrder(node.right);
    }
}
