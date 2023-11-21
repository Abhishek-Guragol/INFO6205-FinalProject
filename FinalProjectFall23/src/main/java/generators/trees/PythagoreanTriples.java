package generators.trees;

import utils.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class PythagoreanTriples {

    public String res = ""; 

    public String generateTriples(int n){

        FibonacciSquares fib = new FibonacciSquares();
        Node tree = fib.generateSquares(n);
        printTree(tree);
       
        return res;
    }

    public void printTree(Node tree){
        if (tree == null) return ;
        res = res + "["+(String.join(",",genNodeTriple(tree).
                                                    stream().
                                                    map(String::valueOf).
                                                    collect(Collectors.joining(","))))+"]";
        

        if(tree.getLeft() == null) return ;
        printTree(tree.getLeft());
        printTree(tree.getMid());
        printTree(tree.getRight());
        
    }

    public List<Integer> genNodeTriple(Node n){
        List<Integer> triples = new ArrayList<>();

        triples.add( (n.v*n.v )- (n.u*n.u)); //V^2-U^2
        triples.add( 2*n.u*n.v);
        triples.add(  n.u*(n.v+n.u)+n.v*(n.v-n.u));  //(U*(v+u))+(V*(V-U))
        return triples;
    }
}
