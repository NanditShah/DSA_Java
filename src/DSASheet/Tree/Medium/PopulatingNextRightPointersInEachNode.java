package DSASheet.Tree.Medium;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNode {
    public static void main(String[] args) {
        System.out.println("Populating Next Right Pointers in Each Node");
    }

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    public Node connect(Node root) {
        if(root == null) return root;
        Queue<Node> helperQ = new LinkedList<>();
        helperQ.add(root);

        while(!helperQ.isEmpty()){

            int size = helperQ.size();
            Node prev = null;
            Node topNode = null;
            for(int i = 0;i<size;i++){
                if(prev == null){
                    prev = helperQ.remove();
                }else{
                    topNode = helperQ.remove();
                    prev.next = topNode;
                    prev = topNode;
                }
                if(prev.left != null) helperQ.add(prev.left);
                if(prev.right != null) helperQ.add(prev.right);
            }
        }
        return root;
    }
}
