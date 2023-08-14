package DSASheet.Tree.Easy;

import DSASheet.Tree.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {
    public static void main(String[] args) {
        System.out.println("Convert Sorted Array to Binary Search Tree");
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        return createBalancedBST(l,r,nums);
    }

    public TreeNode createBalancedBST(int left,int right,int[] nums){
        if(left > right) return null;
        int m = (left+right) / 2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = createBalancedBST(left,m-1,nums);
        root.right = createBalancedBST(m+1,right,nums);
        return root;
    }
}
