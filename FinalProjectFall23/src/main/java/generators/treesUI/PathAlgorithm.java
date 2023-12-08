package generators.treesUI;

import java.util.Stack;

public class PathAlgorithm {

    public static Stack<Character> calculatePath(int a, int b) {
        int fact = gcd(a, b);
        a = a / fact;
        b = b / fact;

        Stack<Character> path = new Stack<>();

        while (a != 0 && b != 0 && b != 2 * a) {
            if (2 * a < b) {
                if (b - 2 * a < a) {
                    int temp = a;
                    a = b - 2 * a;
                    b = temp;
                    path.push('m');
                } else {
                    b = b - 2 * a;
                    path.push('l');
                }
            } else {
                int temp = a;
                a = 2 * a - b;
                b = temp;
                path.push('r');
            }
        }

        return path;
    }

    // Euclidean algorithm to find the greatest common divisor (gcd)
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}


