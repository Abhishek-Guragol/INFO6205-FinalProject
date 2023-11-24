package generators.trees;


//Imports for Testing
import org.junit.Test;
import static org.junit.Assert.assertEquals;

@SuppressWarnings("ALL")
public class RationalPairsTest {

    @Test
    public void baseCase0(){

        RationalPairs p = new RationalPairs();
        String genRes = (p.generatePairs(0));
        String exp = "(1/3, 1/2), ";

        assertEquals(genRes, exp);
    }

    @Test
    public void baseCase1(){

        RationalPairs p = new RationalPairs();
        String genRes = (p.generatePairs(3));
        String exp = "(1/3, 1/2), (3/5, 1/4), (3/7, 2/5), (1/5, 2/3), (5/7, 1/6), (5/13, 4/9), (3/11, 4/7), (7/11, 2/9), (7/17, 5/12), (3/13, 5/8), (5/9, 2/7), (5/11, 3/8), (1/7, 3/4), (7/9, 1/8), (7/19, 6/13), (5/17, 6/11), (13/21, 4/17), (13/31, 9/22), (5/23, 9/14), (11/19, 4/15), (11/25, 7/18), (3/17, 7/10), (11/15, 2/13), (11/29, 9/20), (7/25, 9/16), (17/27, 5/22), (17/41, 12/29), (7/31, 12/19), (13/23, 5/18), (13/29, 8/21), (3/19, 8/11), (9/13, 2/11), (9/23, 7/16), (5/19, 7/12), (11/17, 3/14), (11/27, 8/19), (5/21, 8/13), (7/13, 3/10), (7/15, 4/11), (1/9, 4/5), ";

        assertEquals(genRes, exp);
    }
}
