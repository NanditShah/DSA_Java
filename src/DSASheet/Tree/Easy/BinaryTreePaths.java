package DSASheet.Tree.Easy;

import DSASheet.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public static void main(String[] args) {
        System.out.println("Binary Tree Paths");
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        getAllPaths(root,paths,path);

        return paths;
    }

    public void getAllPaths(TreeNode root,List<String> paths,List<Integer> path){
        if(root == null) return;

        if(root.left == null && root.right == null){
            path.add(root.val);
            paths.add(constructPath(path));
            path.remove(path.size() - 1);
            return;
        }

        path.add(root.val);
        getAllPaths(root.left,paths,path);
        getAllPaths(root.right,paths,path);
        path.remove(path.size() - 1);
    }

    public String constructPath(List<Integer> arr){
        String path = "";
        int i = 0;
        for(int val : arr){
            path = path + val;
            if(i != arr.size() - 1){
                path += "->";
            }
            i++;
        }
        return path;
    }
}
