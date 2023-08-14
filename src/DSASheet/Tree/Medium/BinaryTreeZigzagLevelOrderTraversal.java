package DSASheet.Tree.Medium;

import DSASheet.Tree.TreeNode;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {
    public static void main(String[] args) {
        System.out.println("Binary Tree Zigzag Level Order Traversal");
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> tranversalList = new ArrayList<>();
        if(root == null) return tranversalList;

        Queue<TreeNode> helperQueue = new LinkedList<>();
        helperQueue.add(root);
        boolean leftToRight = true;
        while(!helperQueue.isEmpty()){
            int size = helperQueue.size();
            int[] levelTraverse = new int[size];
            for(int i =0;i<size;i++){
                TreeNode node = helperQueue.remove();
                int index = leftToRight ? i : size - i -1;
                levelTraverse[index] = node.val;
                if(node.left != null) helperQueue.add(node.left);
                if(node.right != null) helperQueue.add(node.right);
            }
            List<Integer> levelTraverseList = new ArrayList<>();
            for(int val : levelTraverse){
                levelTraverseList.add(val);
            }
            tranversalList.add(levelTraverseList);
            leftToRight = !leftToRight;

        }
        return tranversalList;
    }
}
