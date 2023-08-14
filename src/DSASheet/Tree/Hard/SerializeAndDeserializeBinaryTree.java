package DSASheet.Tree.Hard;

import DSASheet.Tree.TreeNode;

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
            StringBuilder sb = new StringBuilder();
            Queue<TreeNode> helperQueue = new LinkedList<>();
            helperQueue.add(root);

            while(!helperQueue.isEmpty()){
                for(int i = 0;i<helperQueue.size();i++){
                    TreeNode topNode = helperQueue.remove();
                    if(topNode == null) {
                        sb.append("#,");
                        continue;
                    }
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
            if(data.isEmpty()) return null;
            String[] values = data.split(",");
            Queue<TreeNode> helperQueue = new LinkedList<>();
            TreeNode root = new TreeNode(Integer.parseInt(values[0]));
            helperQueue.add(root);
            for(int i =1;i<values.length;i++){
                TreeNode node = helperQueue.remove();
                if(!values[i].equals("#")){
                    TreeNode left = new TreeNode(Integer.parseInt(values[i]));
                    root.left = left;
                    helperQueue.add(left);
                }
                if(!values[++i].equals("#")){
                    TreeNode right = new TreeNode(Integer.parseInt(values[i]));
                    root.right = right;
                    helperQueue.add(right);
                }
            }
            return root;
        }
    }
}
