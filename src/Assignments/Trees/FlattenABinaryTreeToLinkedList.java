package Assignments.Trees;

public class FlattenABinaryTreeToLinkedList {
    public static void main(String[] args) {
        System.out.println("Flatten a Binary Tree to Linked List");
    }

    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }

        TreeNode prev = null;
        flattenToLL(root);
    }


    TreeNode prev = null;
    private void flattenToLL(TreeNode node) {
        if(node == null) return;

        flattenToLL(node.right);
        flattenToLL(node.left);

        node.right = prev;
        node.left = null;

        prev = node;
    }
}
