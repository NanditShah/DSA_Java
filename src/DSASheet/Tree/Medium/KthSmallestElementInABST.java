package DSASheet.Tree.Medium;

import DSASheet.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementInABST {
    public static void main(String[] args) {
        System.out.println("Kth Smallest Element in a BST");
    }

    List<Integer> traverseList = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return -1;
        getAns(root,k);
        return traverseList.get(k - 1);
    }

    public void getAns(TreeNode root,int k){
        if(root == null || k == traverseList.size()) return;
        getAns(root.left,k);
        traverseList.add(root.val);
        getAns(root.right,k);
    }
}
