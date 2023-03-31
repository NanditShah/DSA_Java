package Assignments.Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOneStack {
    public static void main(String[] args) {
        System.out.println("All traversals in one iteration using single stack");
    }

    class Pair {
        TreeNode node;
        int num;

        public Pair(TreeNode node,int num){
            this.node = node;
            this.num = num;
        }
    }


    public void allTraversalsAtOnce(TreeNode root){
        if(root == null) return;

        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root,1));
        List<TreeNode> preOrder = new ArrayList<>();
        List<TreeNode> inOrder = new ArrayList<>();
        List<TreeNode> postOrder = new ArrayList<>();

        while(!stack.isEmpty()){
            Pair pair = stack.pop();
            if(pair.num == 1){
                preOrder.add(pair.node);
                pair.num++;
                stack.push(pair);
                if(pair.node.left != null){
                    stack.push(new Pair(pair.node.left,1));
                }
            }else if(pair.num == 2){
                inOrder.add(pair.node);
                pair.num++;
                stack.push(pair);
                if(pair.node.right != null){
                    stack.push(new Pair(pair.node.right,1));
                }
            }else if(pair.num == 3){
                postOrder.add(pair.node);
            }
        }
    }
}
