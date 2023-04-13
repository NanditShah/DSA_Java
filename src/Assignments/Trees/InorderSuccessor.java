package Assignments.Trees;

public class InorderSuccessor {
    public static void main(String[] args) {
        System.out.println("Inorder Successor");
    }

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p){
        TreeNode successor = null;
        while(root != null){
            if(p.val > root.val){
                root = root.right;
            }else{
                successor = root;
                root = root.left;
            }
        }
        return successor;
    }
}
