package Grind75;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {
    public static void main(String[] args) {
        System.out.println("Binary Tree Zigzag Level Order Traversal");
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> traversalList = new ArrayList<>();
        if(root == null) return traversalList;

        Queue<TreeNode> helperQueue = new LinkedList<>();
        helperQueue.add(root);
        boolean leftToRight = true;

        while(!helperQueue.isEmpty()){
            int size = helperQueue.size();
            int[] levelTraverse = new int[size];
            for(int i = 0;i<size;i++){
                TreeNode topNode = helperQueue.remove();
                if(topNode.left != null) helperQueue.add(topNode.left);
                if(topNode.right != null) helperQueue.add(topNode.right);
                int index = leftToRight ? i : size - i - 1;
                levelTraverse[index] = topNode.val;
            }

            List<Integer> levelTraverseList = new ArrayList<>();
            for(int val : levelTraverse){
                levelTraverseList.add(val);
            }
            traversalList.add(levelTraverseList);
        }
        return traversalList;
    }
}
