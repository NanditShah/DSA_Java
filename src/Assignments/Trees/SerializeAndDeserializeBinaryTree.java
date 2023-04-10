package Assignments.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserializeBinaryTree {
    public static void main(String[] args) {
        System.out.println("Serialize and Deserialize Binary Tree");
    }

    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if(root == null) return "";

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            StringBuilder sb = new StringBuilder();
            while(!queue.isEmpty()){
                TreeNode node = queue.remove();

                if(node == null){
                    sb.append("#,");
                    continue;
                }
                sb.append(node.val+",");
                queue.add(node.left);
                queue.add(node.right);
            }
            return sb.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if(data.length() == 0) return null;
            Queue<TreeNode> queue = new LinkedList<>();

            String[] values = data.split(",");
            TreeNode root = new TreeNode(Integer.parseInt(values[0]));
            queue.add(root);

            for(int i = 1;i< values.length;i++){
                TreeNode node = queue.remove();
                if(!values[i].equals("#")){
                    TreeNode left = new TreeNode(Integer.parseInt(values[i]));
                    node.left = left;
                    queue.add(left);
                }
                if(!values[++i].equals("#")){
                    TreeNode right = new TreeNode(Integer.parseInt(values[i]));
                    node.right = right;
                    queue.add(right);
                }
            }
            return root;
        }
    }
}
