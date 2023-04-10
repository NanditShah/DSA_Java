package Assignments.Trees;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public static void main(String[] args) {
        System.out.println("Construct Binary Tree from Inorder and Postorder Traversal");
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer> inMap = new HashMap<>();

        for(int i = 0;i<inorder.length;i++){
            inMap.put(inorder[i],i);
        }

        TreeNode root = buildTree(postorder,0,postorder.length - 1,
                inorder,0,inorder.length - 1,
                inMap);

        return root;
    }

    public TreeNode buildTree(int[] postorder,int postStart,int postEnd,
                              int[] inorder,int inStart,int inEnd,
                              Map<Integer,Integer> inMap){

        if(postStart > postEnd || inStart > inEnd){
            return null;
        }

        TreeNode root = new TreeNode(postorder[postEnd]);

        int inRoot = inMap.get(postorder[postEnd]);
        int numsLeft = inRoot - inStart;

        root.left = buildTree(postorder,postStart,postStart+numsLeft - 1,
                inorder,inStart,inRoot - 1,
                inMap);

        root.right = buildTree(postorder,postStart+numsLeft,postEnd - 1,
                inorder,inRoot+1,inEnd,
                inMap);

        return root;
    }
}
