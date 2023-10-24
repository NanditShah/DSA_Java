package Grind75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CloneGraph {

// Definition for a Node.
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
    public static void main(String[] args) {
        System.out.println("Clone Graph");
    }
    public Node cloneGraph(Node node) {
        HashMap<Node,Node> hMap = new HashMap<>();
        Node deepCopyFirstNode = node == null ? null : deepCopy(node,hMap);
        return deepCopyFirstNode;
    }

    public Node deepCopy(Node node,HashMap<Node,Node> hMap){
        if(hMap.containsKey(node)) return hMap.get(node);

        Node deepCopyNode = new Node(node.val);
        hMap.put(node,deepCopyNode);
        for(Node adjNode : node.neighbors){
            if(adjNode != null){
                if(hMap.containsKey(adjNode)) deepCopyNode.neighbors.add(hMap.get(adjNode));
                else{
                    Node deepCopyOfAdjNode = deepCopy(adjNode,hMap);
                    deepCopyNode.neighbors.add(deepCopyOfAdjNode);
                }
            }
        }

        return deepCopyNode;
    }
}
