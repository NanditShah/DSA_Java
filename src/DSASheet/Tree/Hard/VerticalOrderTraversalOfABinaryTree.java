package DSASheet.Tree.Hard;

import DSASheet.Tree.TreeNode;

import java.util.*;

public class VerticalOrderTraversalOfABinaryTree {
    public static void main(String[] args) {
        System.out.println("Vertical Order Traversal of a Binary Tree");
    }

    class Detail {
        int x;
        int y;
        TreeNode node;

        public Detail(int x, int y, TreeNode node) {
            this.x = x;
            this.y = y;
            this.node = node;
        }

        public Detail(){

        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> traversalList = new ArrayList<>();

        if(root == null) return traversalList;

        Queue<Detail> helperQueue = new LinkedList<>();
        helperQueue.add(new Detail(0,0,root));

        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();

        while(!helperQueue.isEmpty()){
            int size = helperQueue.size();

            for(int i =0;i<helperQueue.size();i++){
                Detail topNodeDetail = helperQueue.remove();
                int x = topNodeDetail.x;
                int y = topNodeDetail.y;


                if(!map.containsKey(x)){
                    map.put(x,new TreeMap<>());
                }

                if(!map.get(x).containsKey(y)){
                    map.get(x).put(y,new PriorityQueue<>());
                }

                map.get(x).get(y).add(topNodeDetail.node.val);

                if(topNodeDetail.node.left != null){
                    helperQueue.add(new Detail(x - 1,y + 1,topNodeDetail.node.left));
                }
                if(topNodeDetail.node.right != null){
                    helperQueue.add(new Detail(x + 1,y + 1,topNodeDetail.node.right));
                }
            }
        }

        for(TreeMap<Integer,PriorityQueue<Integer>> innerTreeMap: map.values()){
            traversalList.add(new ArrayList<>());
            for(PriorityQueue<Integer> pQ : innerTreeMap.values()){
                while(!pQ.isEmpty()){
                    traversalList.get(traversalList.size() - 1).add(pQ.remove());
                }
            }
        }

        return traversalList;
    }
}
