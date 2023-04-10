package Assignments.Trees;

public class CeilInABinarySearchTree {
    public static void main(String[] args) {
        System.out.println("Ceil in a Binary Search Tree");
    }

    public int getCeil(TreeNode root,int key){
        int ceil = -1;
        while(root != null){
            if(root.val == key){
                ceil = root.val;
                return ceil;
            }

            if(key > root.val){
                root = root.right;
            }else{
                ceil = root.val;
                root = root.left;
            }
        }

        return ceil;
    }
}
