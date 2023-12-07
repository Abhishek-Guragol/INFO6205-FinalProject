package generators.trees;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertTrue;

@SuppressWarnings("ALL")
public class PathSearcherTest {


    @Test
    public void baseCase0(){

        FibonacciSquares test = new FibonacciSquares();
        test.generateSquares(6);
        PathSearcher searcher = new PathSearcher();
        String exp = "lllr";
        assertEquals(exp,searcher.searchPath(test.getTreeRoot(), 2, 3, 4, 5));
        System.out.println("Expected: "+exp+"\nRecieved:"+searcher.searchPath(test.getTreeRoot(), 2, 3, 4, 5));
    }

    @Test
    public void baseCaseN(){

        FibonacciSquares test = new FibonacciSquares();
        test.generateSquares(6);
        PathSearcher searcher = new PathSearcher();
        String exp = "lrl";
        assertEquals(exp,searcher.searchPath(test.getTreeRoot(), 1, 3, 4, 5));
        System.out.println("Expected: "+exp+"\nRecieved:"+searcher.searchPath(test.getTreeRoot(), 2, 3, 4, 5));
    }
    
}
