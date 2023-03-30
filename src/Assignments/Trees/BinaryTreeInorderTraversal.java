package Assignments.Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        System.out.println("Binary Tree Inorder Traversal");
    }

    public List<Integer> inorderTraversal(TreeNode root) {
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

        traverse(node.left,traversed);
        traversed.add(node.val);
        traverse(node.right,traversed);
    }

    public List<Integer> inorderTraversalIterative(TreeNode root) {
        List<Integer> traversed = new ArrayList<>();
        Stack<TreeNode> traverseStack = new Stack<>();
        if(root == null){
            return traversed;
        }

        TreeNode node = root;
        while(true){
            if(node != null){
                traverseStack.push(node);
                node = node.left;
            }else{
                if(traverseStack.isEmpty()){
                    break;
                }else{
                    TreeNode topNode = traverseStack.pop();
                    traversed.add(topNode.val);
                    node = topNode.right;
                }
            }
        }
        return traversed;
    }

}
