package treesUI;
import org.junit.Test;

import generators.treesUI.Traversal;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class TraversalTest {
    
    @Test
    public void baseCase0(){
        
        Traversal t = new Traversal(4);
        List<String> path = new ArrayList<>();
        path.add("l");
        path.add("m");
        String rec = t.getNode(path);
        String exp = "[13,9,4,5]";

        assertEquals(exp, rec);
        
    }

    @Test
    public void baseCase1(){
        
        Traversal t = new Traversal(4);
        List<String> path = new ArrayList<>();
        path.add("l");
        path.add("m");
        path.add("r");
        String rec = t.getNode(path);
        String exp = "[23,14,9,5]";

        assertEquals(exp, rec);
        
    }

    @Test
    public void errorCase0(){
        
        // Length of path > Height of gebnerated tree
        Traversal t = new Traversal(4);
        List<String> path = new ArrayList<>();
        path.add("l");
        path.add("m");
        path.add("r");
        path.add("l");
        path.add("m");
        path.add("r");
        String rec = t.getNode(path);
        String exp = "";

        assertEquals(exp, rec);
        
    }

    @Test
    public void pythagoreanTraversalErrorTest(){
        
        // Length of path > Height of gebnerated tree
        Traversal t = new Traversal(4);
        List<String> path = new ArrayList<>();
        path.add("l");
        path.add("m");
        path.add("r");
        path.add("l");
        path.add("m");
        path.add("r");
        String rec = t.pythagoreanTraversal(path);
        String exp = "";

        assertEquals(exp, rec);
        
    }

    @Test
    public void pythagoreanTraversalTest0(){
        
        Traversal t = new Traversal(4);
        List<String> path = new ArrayList<>();
        path.add("l");
        path.add("m");
        String rec = t.pythagoreanTraversal(path);
        String exp = "[65,72,97]";

        assertEquals(exp, rec);
        
    }

    @Test
    public void rationalTraversalErrorTest(){
        
        // Length of path > Height of gebnerated tree
        Traversal t = new Traversal(4);
        List<String> path = new ArrayList<>();
        path.add("l");
        path.add("m");
        path.add("r");
        path.add("l");
        path.add("m");
        path.add("r");
        String rec = t.rationalTraversal(path);
        String exp = "";

        assertEquals(exp, rec);
        
    }

    @Test
    public void rationalTraversalTest0(){
        
        Traversal t = new Traversal(4);
        List<String> path = new ArrayList<>();
        path.add("l");
        path.add("m");
        String rec = t.rationalTraversal(path);
        String exp = "(5/13, 4/9)";

        assertEquals(exp, rec);
        
    }
}
