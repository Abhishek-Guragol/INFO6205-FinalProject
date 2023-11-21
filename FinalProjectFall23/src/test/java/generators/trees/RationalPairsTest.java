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
        String exp = "(1/3,1/2)";

        assertEquals(genRes, exp);
    }

    @Test
    public void baseCase1(){

        RationalPairs p = new RationalPairs();
        String genRes = (p.generatePairs(2));
        String exp = "(1/3,1/2)(3/5,1/4)(5/7,1/6)(5/13,4/9)(3/11,4/7)(3/7,2/5)(7/11,2/9)(7/17,5/12)(3/13,5/8)(1/5,2/3)(5/9,2/7)(5/11,3/8)(1/7,3/4)";

        assertEquals(genRes, exp);
    }
}
