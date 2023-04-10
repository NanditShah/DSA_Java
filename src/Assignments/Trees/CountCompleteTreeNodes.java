package Assignments.Trees;

public class CountCompleteTreeNodes {
    public static void main(String[] args) {
        System.out.println("Count Complete Tree Nodes");
    }

    public int findLeftHeight(TreeNode node){
        int height = 0;
        while(node != null){
            height ++;
            node = node.left;
        }
        return height;
    }
    public int findRightHeight(TreeNode node){
        int height = 0;
        while(node != null){
            height ++;
            node = node.right;
        }
        return height;
    }
    public int countNodes(TreeNode root) {
        if(root == null) return 0;

        int totalNodes = 0;

        int leftHeight = findLeftHeight(root.left);
        int rightHeight = findRightHeight(root.right);

        if(leftHeight == rightHeight) return ((2<<leftHeight)+1);

        return countNodes(root.left)+countNodes(root.right)+1;
    }
}
