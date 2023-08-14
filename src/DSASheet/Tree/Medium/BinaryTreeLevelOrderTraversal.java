package DSASheet.Tree.Medium;

import DSASheet.Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        System.out.println("Binary Tree Level Order Traversal");
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> traversal = new ArrayList<>();
        if(root == null) return traversal;
        Queue<TreeNode> helperQueue = new LinkedList<>();
        helperQueue.add(root);

        while(!helperQueue.isEmpty()){
            int size = helperQueue.size();
            List<Integer> levelViseTraversedNodes = new ArrayList<>();
            for(int i =0;i<size;i++){
                TreeNode topNode = helperQueue.remove();
                levelViseTraversedNodes.add(topNode.val);
                if(topNode.left != null) helperQueue.add(topNode.left);
                if(topNode.right != null) helperQueue.add(topNode.right);
            }
            traversal.add(levelViseTraversedNodes);
        }
        return traversal;
    }
}
