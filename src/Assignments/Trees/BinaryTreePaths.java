package Assignments.Trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public static void main(String[] args) {
        System.out.println("Binary Tree Paths");
        List<Integer> nodes = new ArrayList<>();

//        nodes.add(1);
//        nodes.add(2);
//        nodes.add(3);
//        nodes.add(4);
//        nodes.add(5);

//        System.out.println(constructPath(nodes));
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        List<Integer> pathArr = new ArrayList<>();

        getAllPaths(root,pathArr,paths);
        return paths;
    }

    private void getAllPaths(TreeNode node, List<Integer> pathArr,List<String> paths) {
        if(node == null){
            return;
        }

//        It is a leaf node
        if(node.left == null && node.right == null){
            pathArr.add(node.val);
            paths.add(constructPath(pathArr));
            pathArr.remove(pathArr.size() - 1);
            return;
        }
        pathArr.add(node.val);
        getAllPaths(node.left,pathArr,paths);
        getAllPaths(node.right,pathArr,paths);
        pathArr.remove(pathArr.size() - 1);
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
