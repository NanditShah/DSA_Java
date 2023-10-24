package Grind75;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public static void main(String[] args) {
        System.out.println("Construct Binary Tree from Preorder and Inorder Traversal");
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> inMap = new HashMap<>();

        for(int i = 0;i<inorder.length;i++){
            inMap.put(inorder[i],i);
        }

        TreeNode root = buildTree(preorder,0,preorder.length - 1,
                inorder,0,inorder.length - 1,
                inMap);

        return root;
    }

    public TreeNode buildTree(int[] preorder,int prestart,int preend,int[] inorder,int instart,int inend,Map<Integer,Integer> inMap){
        if(prestart > preend || instart > inend) return null;

        TreeNode root = new TreeNode(preorder[prestart]);

        int rootIndexInorder = inMap.get(preorder[prestart]);
        int numsLeft = rootIndexInorder - instart;


        root.left = buildTree(preorder,prestart+1,prestart+numsLeft,inorder,instart,rootIndexInorder - 1,inMap);
        root.right = buildTree(preorder,prestart+numsLeft+1,preend,inorder,rootIndexInorder + 1,inend,inMap);

        return root;
    }

}
