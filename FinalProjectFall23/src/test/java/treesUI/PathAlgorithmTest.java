package treesUI;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import generators.treesUI.PathAlgorithm;

import java.util.Stack;


@SuppressWarnings("ALL")
public class PathAlgorithmTest {

    @Test
    public void testCalculatePathCase1() {
        int a = 18;
        int b = 48;

        Stack<Character> path = PathAlgorithm.calculatePath(a, b);

        assertEquals("rm", convertPathToString(path));
    }

    @Test
    public void testCalculatePathCase2() {
        int a = 5;
        int b = 12;

        Stack<Character> path = PathAlgorithm.calculatePath(a, b);
        assertEquals("mm", convertPathToString(path));

    }

    // Helper method to convert Stack<Character> to String
    private String convertPathToString(Stack<Character> path) {
        StringBuilder result = new StringBuilder();
        while (!path.isEmpty()) {
            result.append(path.pop());
        }
        return result.toString();
    }
}

