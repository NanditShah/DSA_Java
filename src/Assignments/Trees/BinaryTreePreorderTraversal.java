package Assignments.Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {
    public static void main(String[] args) {
        System.out.println("Binary Tree Preorder Traversal");
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> traversed = new ArrayList<>();
        if(root == null){
            return traversed;
        }
        traverse(root,traversed);
        return traversed;
    }


    public void traverse(TreeNode node,List<Integer> traversed){
        if(node == null){
            return;
        }
        traversed.add(node.val);
        traverse(node.left,traversed);
        traverse(node.right,traversed);
    }



//    Iterative approach
    public List<Integer> preorderTraversalIterative(TreeNode root) {
        List<Integer> traversed = new ArrayList<>();
        Stack<TreeNode> traverseStack = new Stack<>();
        if(root == null){
            return traversed;
        }

        traverseStack.add(root);

        while(!traverseStack.isEmpty()){
            TreeNode topNode = traverseStack.pop();
            traversed.add(topNode.val);
            if(topNode.right != null) traverseStack.push(topNode.right);
            if(topNode.left != null) traverseStack.push(topNode.left);
        }
        return traversed;
    }

}
