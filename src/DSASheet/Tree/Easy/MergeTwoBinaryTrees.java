package DSASheet.Tree.Easy;

import DSASheet.Tree.TreeNode;

public class MergeTwoBinaryTrees {
    public static void main(String[] args) {
        System.out.println("Merge Two Binary Trees");
    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) return null;
        int val1 = root1 == null ? 0 : root1.val;
        int val2 = root2 == null ? 0 : root2.val;
        TreeNode root = new TreeNode(val1+val2);
        root.left = mergeTrees(root1 == null ? null : root1.left,root2 == null ? null : root2.left);
        root.right = mergeTrees(root1 == null ? null : root1.right,root2 == null ? null : root2.right);
        return root;
    }
}
