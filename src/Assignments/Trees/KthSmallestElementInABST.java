package Assignments.Trees;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementInABST {
    public static void main(String[] args) {
        System.out.println("Kth Smallest Element in a BST");
    }

    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return -1;
        List<Integer> traversalList = new ArrayList<>();
        getAns(root,traversalList,k);
        return traversalList.get(k-1);
    }

    private void getAns(TreeNode node,List<Integer> traversalList,int k) {
        if(node == null) {
            return;
        }
        if(traversalList.size() == k){
            return;
        }
        getAns(node.left,traversalList,k);
        traversalList.add(node.val);
        getAns(node.right,traversalList,k);

    }
}
