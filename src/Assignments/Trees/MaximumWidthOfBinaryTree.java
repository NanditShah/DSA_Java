package Assignments.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthOfBinaryTree {
    public static void main(String[] args) {
        System.out.println("Maximum Width of Binary Tree");
    }

    class Detail {
        int index;
        TreeNode node;

        public Detail(int index,TreeNode node){
            this.index = index;
            this.node = node;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int ans = 0;
        Queue<Detail> detailQueue = new LinkedList<>();

        detailQueue.add(new Detail(0,root));

        while(!detailQueue.isEmpty()){
            int size = detailQueue.size();
            int prevMinIndex = detailQueue.peek().index;
            int first = 0,last = 0;

            for(int i = 0;i<size;i++){
                int curr_id = detailQueue.peek().index - prevMinIndex;
                TreeNode node = detailQueue.remove().node;

                if(i == 0) first = curr_id;
                if(i == size - 1) last = curr_id;
                if(node.left != null){
                    detailQueue.add(new Detail(curr_id*2+1,node.left));
                }
                if(node.right != null){
                    detailQueue.add(new Detail(curr_id*2+2,node.right));
                }
            }
            ans = Math.max(ans,last - first + 1);
        }
        return ans;

    }
}
