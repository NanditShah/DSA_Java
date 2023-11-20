package Blind75.Tree;

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
            Queue<TreeNode> helperQueue = new LinkedList<>();
            StringBuilder sb = new StringBuilder();
            helperQueue.add(root);

            while (!helperQueue.isEmpty()){
                TreeNode topNode = helperQueue.remove();
                if(topNode == null){
                    sb.append("#,");
                }else{
                    sb.append(topNode.val+",");
                    helperQueue.add(topNode.left);
                    helperQueue.add(topNode.right);
                }
            }
            System.out.println(sb.toString());
            return sb.toString();

        }
        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if(data == "") return null;
            Queue<TreeNode> helperQueue = new LinkedList<>();
            String[] nodes = data.split(",");
            TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
            helperQueue.add(root);
            int i = 1;
            while(i < nodes.length){
                TreeNode topNode = helperQueue.remove();
                if(!nodes[i].equals("#")){
                    TreeNode left = new TreeNode(Integer.parseInt(nodes[i]));
                    topNode.left = left;
                    helperQueue.add(left);
                }
                if(!nodes[++i].equals("#")){
                    TreeNode right = new TreeNode(Integer.parseInt(nodes[i]));
                    topNode.right = right;
                    helperQueue.add(right);
                }
                i++;
            }
            return root;
        }
    }

}
