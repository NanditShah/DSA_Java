package Blind75.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CloneGraph {
    public static void main(String[] args) {
        System.out.println("Clone Graph");
    }

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

    public Node cloneGraph(Node node) {
        if(node == null) return null;
        HashMap<Integer,Node> visited = new HashMap<>();
        return cloneGraph(node,visited);
    }

    public Node cloneGraph(Node node,HashMap<Integer,Node> visited){
        if(visited.containsKey(node.val)) return visited.get(node.val);
        Node clonedNode = new Node(node.val);
        visited.put(node.val,clonedNode);
        for(Node neighborNode : node.neighbors){
            if(visited.containsKey(neighborNode)) return visited.get(neighborNode);
            clonedNode.neighbors.add(cloneGraph(neighborNode,visited));
        }
        return clonedNode;
    }
}
