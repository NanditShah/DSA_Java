package Assignments.Trees;

import java.util.Stack;

public class TwoSumIV_InputIsABST {
    public static void main(String[] args) {
        System.out.println("Two Sum IV - Input is a BST");
    }

    class BSTIterator {

        Stack<TreeNode> inorderStack = new Stack<>();
        boolean reverse;
        public BSTIterator(TreeNode root,boolean reverse) {
            this.reverse = reverse;
            pushAll(root);
        }

        private void pushAll(TreeNode node) {
            while(node != null){
                inorderStack.push(node);
                if(this.reverse){
                    node = node.right;
                }else{
                    node = node.left;
                }
            }
        }

        public int next() {
            TreeNode poppedNode = inorderStack.pop();
            if(reverse){
                pushAll(poppedNode.left);
            }else{
                pushAll(poppedNode.right);
            }
            return poppedNode.val;
        }

        public boolean hasNext() {
            return !inorderStack.isEmpty();
        }
    }

    public boolean findTarget(TreeNode root, int k) {
        BSTIterator leftIterator = new BSTIterator(root,false);
        BSTIterator rightIterator = new BSTIterator(root,true);

        int left = leftIterator.next();

//        Right next actully means before element for inorder traversal
        int right = rightIterator.next();

        while(left < right){
            if(left+right == k) return true;
            else if(left+right > k) right = rightIterator.next();
            else left = leftIterator.next();
        }

        return false;
    }

}
