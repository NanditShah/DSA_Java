package DSASheet.Tree.Medium;

import DSASheet.Tree.TreeNode;

import java.util.Stack;

public class BinarySearchTreeIterator {
    public static void main(String[] args) {
        System.out.println("Binary Search Tree Iterator");
    }

    class BSTIterator {

        Stack<TreeNode> stk = new Stack<>();
        public BSTIterator(TreeNode root) {
            pushAllLeft(root);
        }

        private void pushAllLeft(TreeNode node) {
            while(node != null){
                stk.push(node);
                node = node.left;
            }
        }

        public int next() {
            TreeNode node = stk.pop();
            pushAllLeft(node.right);
            return node.val;
        }

        public boolean hasNext() {
            return !stk.isEmpty();
        }
    }
}
