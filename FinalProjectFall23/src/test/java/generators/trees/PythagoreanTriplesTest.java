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
        String exp = "{3,4,5}, ";
        assertEquals(genRes, exp);
        
    }

    @Test
    public void baseCaseN(){

        PythagoreanTriples t = new PythagoreanTriples();
        String genRes = t.generateTriples(3);
        String exp = "{3,4,5}, {15,8,17}, {21,20,29}, {5,12,13}, {35,12,37}, {65,72,97}, {33,56,65}, {77,36,85}, {119,120,169}, {39,80,89}, {45,28,53}, {55,48,73}, {7,24,25}, {63,16,65}, {133,156,205}, {85,132,157}, {273,136,305}, {403,396,565}, {115,252,277}, {209,120,241}, {275,252,373}, {51,140,149}, {165,52,173}, {319,360,481}, {175,288,337}, {459,220,509}, {697,696,985}, {217,456,505}, {299,180,349}, {377,336,505}, {57,176,185}, {117,44,125}, {207,224,305}, {95,168,193}, {187,84,205}, {297,304,425}, {105,208,233}, {91,60,109}, {105,88,137}, {9,40,41}, ";
        assertEquals(genRes, exp);

    }
}
