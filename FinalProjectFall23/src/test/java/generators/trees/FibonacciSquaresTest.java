package generators.trees;



//Imports for tests
import org.junit.Test;
import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertTrue;

@SuppressWarnings("ALL")
public class FibonacciSquaresTest {

    @Test
    public void treeInitialised(){

        FibonacciSquares test = new FibonacciSquares();
        test.generateSquares(3);
        String exp = "[1,1,2,3], [3,1,4,5], [3,2,5,7], [1,2,3,5], [5,1,6,7], [5,4,9,13], [3,4,7,11], [7,2,9,11], [7,5,12,17], [3,5,8,13], [5,2,7,9], [5,3,8,11], [1,3,4,7], [7,1,8,9], [7,6,13,19], [5,6,11,17], [13,4,17,21], [13,9,22,31], [5,9,14,23], [11,4,15,19], [11,7,18,25], [3,7,10,17], [11,2,13,15], [11,9,20,29], [7,9,16,25], [17,5,22,27], [17,12,29,41], [7,12,19,31], [13,5,18,23], [13,8,21,29], [3,8,11,19], [9,2,11,13], [9,7,16,23], [5,7,12,19], [11,3,14,17], [11,8,19,27], [5,8,13,21], [7,3,10,13], [7,4,11,15], [1,4,5,9], ";
        assertEquals(exp,test.treeBFS());
        System.out.println("Expected: "+exp+"  Recieved:"+test.treeBFS());
    }
}
