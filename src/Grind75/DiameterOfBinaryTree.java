package Grind75;

public class DiameterOfBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        System.out.println("Diameter of Binary Tree");
    }


    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        computeTreeDiameter(root);
        return diameter;
    }

    public int computeTreeDiameter(TreeNode root){
        if(root == null) return 0;
        int leftHeight = computeTreeDiameter(root.left);
        int rightHeight = computeTreeDiameter(root.left);

        diameter = Math.max(diameter,leftHeight+rightHeight);
        return 1 + Math.max(leftHeight,rightHeight);
    }
}
