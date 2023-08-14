package DSASheet.Tree.Medium;

import DSASheet.Tree.TreeNode;

public class RecoverBinarySearchTree {


    public static void main(String[] args) {
        System.out.println("Recover Binary Search Tree");
    }

    TreeNode prev = null;
    TreeNode first = null;
    TreeNode middle = null;
    TreeNode last = null;
    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        if(prev != null && root.val < prev.val){
            if(first == null){
                first = prev;
                middle = root;
            }else{
                last = root;
            }
        }
        prev = root;
        inorder(root.right);
    }
    public void recoverTree(TreeNode root) {
        prev = new TreeNode(Integer.MIN_VALUE);
        inorder(root);

        if(first != null && last != null){
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
