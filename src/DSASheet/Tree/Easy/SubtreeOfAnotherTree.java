package DSASheet.Tree.Easy;

import DSASheet.Tree.TreeNode;

public class SubtreeOfAnotherTree {
    public static void main(String[] args) {
        System.out.println("Subtree of Another Tree");
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null) return true;
        if(root == null) return false;
        if(isSameTree(root,subRoot)) return true;
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }

    public boolean isSameTree(TreeNode tree1,TreeNode tree2){
        if(tree1 == null && tree2 == null) return true;
        if(tree1 != null && tree2 != null && tree1.val == tree2.val){
            return isSameTree(tree1.left,tree2.left) && isSameTree(tree1.right,tree2.right);
        }
        return false;
    }
}
