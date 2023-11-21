package generators.trees;


//Imports for testing
import org.junit.Test;
import static org.junit.Assert.assertEquals;

@SuppressWarnings("ALL")
public class PythagoreanTriplesTest {

    @Test
    public void baseCase0(){

        PythagoreanTriples t = new PythagoreanTriples();
        String genRes = t.generateTriples(0);
        String exp = "[3,4,5]";
        assertEquals(genRes, exp);
        
    }

    @Test
    public void baseCaseN(){

        PythagoreanTriples t = new PythagoreanTriples();
        String genRes = t.generateTriples(2);
        String exp = "[3,4,5][15,8,17][35,12,37][65,72,97][33,56,65][21,20,29][77,36,85][119,120,169][39,80,89][5,12,13][45,28,53][55,48,73][7,24,25]";
        assertEquals(genRes, exp);

    }
}
