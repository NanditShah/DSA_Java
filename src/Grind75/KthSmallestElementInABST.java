package Grind75;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementInABST {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {
        System.out.println("Kth Smallest Element in a BST");
    }

    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return -1;

        List<Integer> list = new ArrayList<>();
        preorderTraversal(root,list);

        for(int val : list){
            k--;
            if(k == 0) return val;
        }
        return -1;
    }

    private void preorderTraversal(TreeNode root,List<Integer> list){
        if(root == null) return;
        preorderTraversal(root.left,list);
        list.add(root.val);
        preorderTraversal(root.right,list);
    }
}
