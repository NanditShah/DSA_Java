package Assignments.Trees;

public class ChildrenSumPropertyInBinaryTree {
    public static void main(String[] args) {
        System.out.println("Children Sum Property in Binary Tree");
    }

    public void convertToChildSumTree(TreeNode root){
        if(root == null) return;

        int child = 0;
        if(root.left != null) child += root.left.val;
        if(root.right != null) child += root.right.val;

        if(child >= root.val) root.val = child;
        else{
            if(root.left != null) root.left.val = child;
            if(root.right != null) root.right.val = child;
        }

        convertToChildSumTree(root.left);
        convertToChildSumTree(root.right);

        int totalOfLeftAndRight = 0;
        if(root.left != null) totalOfLeftAndRight += root.left.val;
        if(root.right != null) totalOfLeftAndRight += root.right.val;
        if(root.left != null || root.right != null) root.val = totalOfLeftAndRight;
    }
}
