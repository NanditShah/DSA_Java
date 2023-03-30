package Assignments.Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {
    public static void main(String[] args) {
        System.out.println("Binary Tree Postorder Traversal");
    }

    public List<Integer> postorderTraversal(TreeNode root) {
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
        traverse(node.right,traversed);
        traversed.add(node.val);
    }


//    Need to go through again
    public List<Integer> postorderTraversalIterative(TreeNode root){
        ArrayList <Integer> postOrder = new ArrayList<>();
        if (root == null) return postOrder;

        Stack <TreeNode> st = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !st.isEmpty()) {
            if (cur != null) {
                st.push(cur);
                cur = cur.left;
            } else {
                TreeNode temp = st.peek().right;
                if (temp == null) {
                    temp = st.peek();
                    st.pop();
                    postOrder.add(temp.val);
                    while (!st.isEmpty() && temp == st.peek().right) {
                        temp = st.peek();
                        st.pop();
                        postOrder.add(temp.val);
                    }
                } else cur = temp;
            }
        }
        return postOrder;
    }
    
}
