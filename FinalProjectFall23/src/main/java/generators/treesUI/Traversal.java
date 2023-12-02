package generators.treesUI;

import java.util.List;

import generators.trees.FibonacciSquares;
import utils.Node;

public class Traversal {

    Node root;
    int height;

    public Traversal(int n){
        FibonacciSquares fib = new FibonacciSquares();
        root= fib.generateSquares(n);
        this.height = n;
    }

    public String getNode(List<String> path){
        if (path == null || path.size() <= 0 || path.size() > height) return "";

        Node curNode = root;
        String res = "";
        for(String i : path){
            if(i == "l") curNode = curNode.left;
            else if (i == "m") curNode = curNode.mid;
            else if (i == "r") curNode = curNode.right;
        }

        res = "["+(curNode.v+curNode.u)+","+curNode.v+","+curNode.u+","+(curNode.v-curNode.u)+"]";

        return res;
    }
    
}
