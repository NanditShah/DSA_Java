package Assignments.Trees;

public class FloorInABinarySearchTree {
    public static void main(String[] args) {
        System.out.println("Floor in a Binary Search Tree");
    }

    public int getFloor(TreeNode root,int key){
        int floor = -1;
        while(root != null){
            if(root.val == key){
                floor = root.val;
                return floor;
            }

            if(key > root.val){
                floor = root.val;
                root = root.right;
            }else{
                root = root.left;
            }
        }

        return floor;
    }

}
