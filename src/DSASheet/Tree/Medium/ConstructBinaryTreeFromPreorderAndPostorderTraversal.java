package DSASheet.Tree.Medium;

import DSASheet.Tree.TreeNode;

public class ConstructBinaryTreeFromPreorderAndPostorderTraversal {
    public static void main(String[] args) {
        System.out.println("Construct Binary Tree from Preorder and Postorder Traversal");
    }

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int noOfNodes = preorder.length;
        if(noOfNodes == 0) return null;
        if(noOfNodes == 1) return new TreeNode(preorder[0]);
        TreeNode root = constructBinaryTree(preorder,0,noOfNodes+1,
                postorder,0,noOfNodes+1);
        return root;
    }

    public TreeNode constructBinaryTree(int[] preorder,int preStart,int preEnd,
                                        int[] postorder,int postStart, int postEnd){
        TreeNode root = new TreeNode(preorder[preStart]);

        if(preStart == preEnd) return root;

        int index = postStart;
        while(postorder[index] != preorder[preStart+1]) index++;

        int tnel = index - postStart + 1;

        root.left = constructBinaryTree(preorder,preStart+1,preStart+tnel,
                postorder,postStart,index);
        root.right = constructBinaryTree(preorder,preStart+tnel+1,preEnd,
                postorder,index+1,postEnd - 1);
        return root;
    }
}
