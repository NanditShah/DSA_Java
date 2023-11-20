package Assignments.Easy;

import Assignments.Trees.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindModeInBinarySearchTree {
    public static void main(String[] args) {
        System.out.println("Find Mode in Binary Search Tree");
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val,TreeNode left,TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

        private int currentVal;
        private int currentCount = 0;
        private int maxCount = 0;
        private List<Integer> modes = new ArrayList<>();

        public int[] findMode(TreeNode root) {
            inOrderTraversal(root);
            int[] result = new int[modes.size()];
            for (int i = 0; i < modes.size(); i++) {
                result[i] = modes.get(i);
            }
            return result;
        }

        private void inOrderTraversal(TreeNode node) {
            if (node == null) return;

            inOrderTraversal(node.left);

            currentCount = (node.val == currentVal) ? currentCount + 1 : 1;
            if (currentCount == maxCount) {
                modes.add(node.val);
            } else if (currentCount > maxCount) {
                maxCount = currentCount;
                modes.clear();
                modes.add(node.val);
            }
            currentVal = node.val;

            inOrderTraversal(node.right);
        }
}