package DSASheet.Tree.Medium;

import DSASheet.Tree.TreeNode;

public class FlattenBinaryTreeToLinkedList {
    public static void main(String[] args) {
        System.out.println("Flatten Binary Tree to Linked List");
    }

    public void flatten(TreeNode root) {
        if(root == null) return;

        flattenToLL(root);
    }

    public TreeNode flattenToLL(TreeNode root){
        if(root == null) return root;

        TreeNode leftTail = flattenToLL(root.left);
        TreeNode rightTail = flattenToLL(root.right);

        if(leftTail != null){
            leftTail.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        return rightTail != null ? rightTail : (leftTail != null ? leftTail : root);
    }
}
