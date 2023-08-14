package DSASheet.Tree.Medium;

import DSASheet.Tree.TreeNode;

import java.util.ArrayList;

public class CountGoodNodesInBinaryTree {
    public static void main(String[] args) {
        System.out.println("Count Good Nodes in Binary Tree");
    }

    int noOfGoodNodes = 0;
    public int goodNodes(TreeNode root) {
        if(root == null) return 0;
        int maxValue = Integer.MIN_VALUE;
        getNumOfGoodNodes(root,maxValue);
        return noOfGoodNodes;
    }

    public void getNumOfGoodNodes(TreeNode root,int maxValue){
        if(root == null) return;
        if(root.val >= maxValue) {
            maxValue = root.val;
            noOfGoodNodes ++;
        }
        getNumOfGoodNodes(root.left,maxValue);
        getNumOfGoodNodes(root.right,maxValue);
    }
}
