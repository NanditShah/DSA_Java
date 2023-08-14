package DSASheet.Tree.Hard;

import DSASheet.Tree.TreeNode;

public class BinaryTreeCameras {
    public static void main(String[] args) {
        System.out.println("Binary Tree Cameras");
    }

//    0 -- Not Covered
//    1 -- Covered
//    2 -- Has Camera
    int cam = 0;
    public int minCameraCover(TreeNode root) {
        if(root == null) return cam;
        int ans = dfsForCamera(root);
        return ans == 0 ? cam+1 : cam;
    }

    public int dfsForCamera(TreeNode root){
        if(root == null) return 1;
        int left = dfsForCamera(root.left);
        int right = dfsForCamera(root.right);

        if(left == 0 || right == 0){
            cam++;
            return 2;
        } else if(left == 2 || right == 2){
            return 1;
        }else{
            return 0;
        }
    }
}
