package generators.trees;

import utils.Node;



public class RationalPairs {
    public String res = "";

    public String generatePairs(int n){

        FibonacciSquares fib = new FibonacciSquares();
        Node tree = fib.generateSquares(n);
        printPairs(tree);
       
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

    // public List<Integer> genNodePairs(Node n){
    //     List<Integer> triples = new ArrayList<>();

    //     triples.add( (n.v*n.v )- (n.u*n.u)); //V^2-U^2
    //     triples.add( 2*n.u*n.v);
    //     triples.add(  n.u*(n.v+n.u)+n.v*(n.v-n.u));  //(U*(v+u))+(V*(V-U))
    //     return triples;
    // }
}
