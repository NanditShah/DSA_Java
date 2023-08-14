package DSASheet.DFS.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CloneGraph {
    public static void main(String[] args) {
        System.out.println("Clone Graph");
    }

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

    public Node cloneGraph(Node node) {
        HashMap<Node,Node> hMap = new HashMap<>();
        Node deepColonedNode = node != null ? deepClone(hMap,node) : null;
        return deepColonedNode;
    }

    public Node deepClone(HashMap<Node,Node> hMap,Node node){
        if(hMap.containsKey(node)) return hMap.get(node);
        Node copy = new Node(node.val);
        hMap.put(node,copy);
        for(Node adjNode : node.neighbors){
            if(adjNode != null){
                Node copyNode = deepClone(hMap,adjNode);
                copy.neighbors.add(copyNode);
            }
        }
        return copy;
    }
}
