package Assignments.Trees;

public class RecoverBinarySearchTree {
    public static void main(String[] args) {
        System.out.println("Recover Binary Search Tree");
    }

    TreeNode prev = null;
    TreeNode first = null;
    TreeNode middle = null;
    TreeNode last = null;

    public void inOrder(TreeNode node){
        if(node == null) return;

        inOrder(node.left);

        if(prev != null && prev.val > node.val){
            if(first == null){
                first = prev;
                middle = node;
            }
            else{
                last = node;
            }
        }

        prev = node;
        inOrder(node.right);
    }


    public void recoverTree(TreeNode root) {
        prev = new TreeNode(Integer.MIN_VALUE);
        inOrder(root);

        if(first != null && last != null) {
            int tempVal = first.val;
            first.val = last.val;
            last.val = tempVal;
        }else{
            int tempVal = first.val;
            first.val = middle.val;
            middle.val = tempVal;
        }
    }
}
