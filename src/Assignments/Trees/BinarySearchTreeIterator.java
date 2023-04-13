package Assignments.Trees;

import java.util.Stack;

public class BinarySearchTreeIterator {
    public static void main(String[] args) {
        System.out.println("Binary Search Tree Iterator");
    }

    class BSTIterator {

        Stack<TreeNode> inorderStack = new Stack<>();
        public BSTIterator(TreeNode root) {
            pushAllLeft(root);
        }

        private void pushAllLeft(TreeNode node) {
            while(node != null){
                inorderStack.push(node);
                node = node.left;
            }
        }

        public int next() {
            TreeNode poppedNode = inorderStack.pop();
            pushAllLeft(poppedNode.right);
            return poppedNode.val;
        }

        public boolean hasNext() {
            return !inorderStack.isEmpty();
        }
    }
}
