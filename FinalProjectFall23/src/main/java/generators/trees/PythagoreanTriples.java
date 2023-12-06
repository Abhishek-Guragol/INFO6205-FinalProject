package generators.trees;

import utils.Node;

import java.util.ArrayList;
import java.util.List;


public class PythagoreanTriples {

    public String res = ""; 

    public String generateTriples(int n){

        FibonacciSquares fib = new FibonacciSquares();
        Node tree = fib.generateSquares(n);
        pythagoreanBFS(tree);
        return res;
    }

    
    public void pythagoreanBFS(Node tree){

        res = "";
        if(tree == null) return ;
        List<Node> queue = new ArrayList<>();
        queue.add(tree);
        while(!queue.isEmpty()){
            Node temp = queue.remove(0);
            res = res + temp.getPythagoreanLazy()+", ";
            if(temp.getLeft() != null) {
                queue.add(temp.getLeft());
                queue.add(temp.getMid());
                queue.add(temp.getRight());
            }

        }

    }
}
