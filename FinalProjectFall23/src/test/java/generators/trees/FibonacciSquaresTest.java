package generators.trees;

import generators.trees.FibonacciSquares;

//Imports for tests
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@SuppressWarnings("ALL")
public class FibonacciSquaresTest {

    @Test
    public void treeInitialised(){

        FibonacciSquares test = new FibonacciSquares();
        test.generateSquares(2);
        test.getVal();
//        assertEquals(test.treeRoot.getVal(),"[1,1,2,3]");
        System.out.println("Expected: [1,1,2,3]   Recieved:"+test.treeRoot.getVal());
    }
}
