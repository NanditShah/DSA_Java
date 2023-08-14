package DSASheet.Tree.Easy;

import DSASheet.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        System.out.println("Binary Tree Inorder Traversal");
    }

    List<Integer> traversal = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
//        Recursive method
//        inorderRecursiveHelper(root);

//        Iterative Method
        inorderIterativeHelper(root);

        return traversal;
    }

    public void inorderRecursiveHelper(TreeNode root){
        if(root == null) return;
        inorderRecursiveHelper(root.left);
        traversal.add(root.val);
        inorderRecursiveHelper(root.right);
    }

    public void inorderIterativeHelper(TreeNode root){
        Stack<TreeNode> inorderStk = new Stack<>();

        TreeNode node = root;
        while(true){
            if(node != null){
                inorderStk.add(node);
                node = node.left;
            }else{
                if(inorderStk.isEmpty()) break;
                TreeNode topNode = inorderStk.pop();
                traversal.add(topNode.val);
                node = node.right;
            }
        }
    }
}
