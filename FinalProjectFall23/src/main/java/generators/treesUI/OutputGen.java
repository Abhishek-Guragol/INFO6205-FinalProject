package generators.treesUI;

import java.util.Stack;

import generators.trees.FibonacciSquares;
import generators.trees.PathSearcher;
import generators.trees.PythagoreanTriples;
import generators.trees.RationalPairs;

public class OutputGen {

    public static void main(String[] args){

        // Print the FibonacciSquares
        FibonacciSquares test = new FibonacciSquares();
        test.generateSquares(6);
        System.out.println("FibonacciSquares:\n"+test.treeBFS());

        // Print the Pythagorean Triples
        PythagoreanTriples t = new PythagoreanTriples();
        System.out.println("Pythagorean Triples:\n"+t.generateTriples(6));

        // Print the Rational Pairs
        RationalPairs p = new RationalPairs();
        System.out.println(" Rational Pairs:\n"+p.generatePairs(6));

        // Brute force method
        PathSearcher searcher = new PathSearcher();
        System.out.println(searcher.searchPath(test.getTreeRoot(), 2, 3, 1, 3));

        // Using the algorithm
        Stack<Character> path = PathAlgorithm.calculatePath(4, 7);

        // Expected output: lr
        while (!path.isEmpty()) {
            System.out.print(path.pop());
        }
    }
    
}
