package Assignments.Trees;

import java.util.*;

public class RightViewOfBinaryTree {
    public static void main(String[] args) {
        System.out.println("Right View of Binary Tree");
    }

    public ArrayList<Integer> rightViewOfTree(TreeNode root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        traversalHelper(root,0,ans);

        return ans;
    }

    private void traversalHelper(TreeNode node, int level,ArrayList<Integer> ans) {
        if(node == null){
            return;
        }

        if(ans.size() == level){
            ans.add(node.val);
        }
        traversalHelper(node.right,level+1,ans);
        traversalHelper(node.left,level+1,ans);
    }

}
