package DSASheet.Tree.Medium;

import DSASheet.Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    public static void main(String[] args) {
        System.out.println("Binary Tree Right Side View");
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightSideView = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode rightSide = null;
            int qSize = queue.size();
            for(int i = 0;i<qSize;i++){
                TreeNode node = queue.remove();
                if(node != null){
                    rightSide = node;
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
            if(rightSide != null)  rightSideView.add(rightSide.val);
        }
        return rightSideView;
    }
}
