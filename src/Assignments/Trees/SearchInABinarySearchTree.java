package Assignments.Trees;

public class SearchInABinarySearchTree {
    public static void main(String[] args) {
        System.out.println("Search in a Binary Search Tree");
    }

    public TreeNode searchBST(TreeNode root, int val) {
        while(root != null && root.val != val){
            root = root.val < val ? root.left : root.right;
        }
        return root;
    }
}
