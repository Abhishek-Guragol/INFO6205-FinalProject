package generators.trees;

import java.util.ArrayList;
import java.util.List;

import utils.Node;



public class RationalPairs {
    public String res = "";

    public String generatePairs(int n){

        FibonacciSquares fib = new FibonacciSquares();
        Node tree = fib.generateSquares(n);
        rationalBFS(tree);
       
        return res;

    }

    public void printPairs(Node tree){
        if (tree == null) return ;
        res = res + "("+(tree.v-tree.u)+"/"+(tree.v+tree.u)+","+tree.u+"/"+tree.v+")";
        

        if(tree.getLeft() == null) return ;
        printPairs(tree.getLeft());
        printPairs(tree.getMid());
        printPairs(tree.getRight());
    }

    public void rationalBFS(Node tree){

        res = "";
        if(tree == null) return ;
        List<Node> queue = new ArrayList<>();
        queue.add(tree);
        while(!queue.isEmpty()){
            Node temp = queue.remove(0);
            res = res + "("+(temp.v-temp.u)+"/"+(temp.v+temp.u)+", "+temp.u+"/"+temp.v+"), ";
            if(temp.getLeft() != null) {
                queue.add(temp.getLeft());
                queue.add(temp.getMid());
                queue.add(temp.getRight());
            }

        }

    }
}
