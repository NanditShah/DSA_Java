package DSASheet.Tree.Medium;

import DSASheet.Tree.TreeNode;

import java.util.*;

public class AllNodesDistanceKInBinaryTree {
    public static void main(String[] args) {
        System.out.println("All Nodes Distance K in Binary Tree");
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        List<Integer> allNodes = new ArrayList<>();
        if(root == null) return allNodes;

        Map<TreeNode,TreeNode> parentTrack = new HashMap<>();

        getParentTrack(root,parentTrack);

        Queue<TreeNode> helperQueue = new LinkedList<>();
        Map<TreeNode,Boolean> visited = new HashMap<>();

        helperQueue.add(target);
        visited.put(target,true);
        int distance = 0;

        while(!helperQueue.isEmpty()){
            int size = helperQueue.size();

            if(distance == k) break;

            distance++;
            for(int i =0;i<size;i++){
                TreeNode node = helperQueue.remove();

                if(node.left != null && visited.get(node.left) == null){
                    visited.put(node.left,true);
                    helperQueue.add(node.left);
                }
                if(node.right != null && visited.get(node.right) == null){
                    visited.put(node.right,true);
                    helperQueue.add(node.right);
                }
                if(parentTrack.get(node) != null && visited.get(parentTrack.get(node)) == null){
                    visited.put(parentTrack.get(node),true);
                    helperQueue.add(parentTrack.get(node));
                }
            }
        }

        while(!helperQueue.isEmpty()){
            allNodes.add(helperQueue.remove().val);
        }

        return allNodes;
    }

    public void getParentTrack(TreeNode root,Map<TreeNode,TreeNode> parentTrack){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode topNode = queue.remove();
            if(topNode.left != null){
                parentTrack.put(topNode.left,topNode);
                queue.add(topNode.left);
            }
            if(topNode.right != null){
                parentTrack.put(topNode.right,topNode);
                queue.add(topNode.right);
            }
        }
    }
}
