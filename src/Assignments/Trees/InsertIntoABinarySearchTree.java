package Assignments.Trees;

public class InsertIntoABinarySearchTree {
    public static void main(String[] args) {
        System.out.println("Insert into a Binary Search Tree");
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        TreeNode traversalNode = root;
        while(true){
            if(val < traversalNode.val){
                if(traversalNode.left == null) {
                    traversalNode.left = new TreeNode(val);
                    break;
                }else{
                    traversalNode = traversalNode.left;
                }
            }else{
                if(traversalNode.right == null) {
                    traversalNode.right = new TreeNode(val);
                    break;
                }else{
                    traversalNode = traversalNode.right;
                }
            }
        }
        return root;
    }
}
