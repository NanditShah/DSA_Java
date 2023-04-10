package Assignments.Trees;

public class DeleteNodeInABST {
    public static void main(String[] args) {
        System.out.println("Delete Node in a BST");
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;

        if(root.val == key) {
            return helper(root);
        }

        TreeNode dummy = root;
        while(root != null){
            if(key < root.val){
                if(root.left != null && root.left.val == key){
                    root.left = helper(root.left);
                    break;
                }else{
                    root = root.left;
                }
            }else{
                if(root.right != null && root.right.val == key){
                    root.right = helper(root.right);
                    break;
                }else{
                    root = root.right;
                }
            }
        }
        return dummy;
    }

    private TreeNode helper(TreeNode node) {
        if(node.left == null){
            return node.right;
        }
        if(node.right == null){
            return node.left;
        }

        TreeNode lastRight = getLastRight(node.left);
        lastRight.right = node.right;
        return node.left;
    }

    private TreeNode getLastRight(TreeNode node) {
        if(node.right == null){
            return node;
        }
        return getLastRight(node.right);

    }
}
