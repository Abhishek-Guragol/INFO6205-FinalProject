package generators.treesUI;


import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

import generators.trees.FibonacciSquares;
import utils.Node;
public class RationalUI {
    public static void main(String[] args){
        FibonacciSquares fib = new FibonacciSquares();
    
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter number of levels"));
        Node tree = fib.generateSquares(n);
        // JOptionPane.showMessageDialog(null, fib.treeBFS());
        JFrame frame = initialiseScreen();
        
        
        renderTress(n, tree, frame);
        frame.setVisible(true);//Make it visible on screen
    }

    public static JFrame initialiseScreen(){

        JFrame frame = new JFrame("Rational Pairs Tree"); //Create a frame
        
        frame.setSize(3000, 3000);//Set Dimension
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        return frame;
    }

    public static void renderTress(int n, Node root, JFrame frame){


        Border br = BorderFactory.createLineBorder(Color.BLACK);
        List<UiNode> queue = new ArrayList<>();
        queue.add(new UiNode(root, n));

       int x = 0;
       int y = 0;
        while (!queue.isEmpty()) {
            UiNode temp = queue.remove(0);
            String t = "("+(temp.n.v-temp.n.u)+"/"+(temp.n.v+temp.n.u)+", "+temp.n.u+"/"+temp.n.v+"), ";
            if(temp.n.getLeft() != null) {
                queue.add(new UiNode(temp.n.getLeft(),1));
                queue.add(new UiNode(temp.n.getMid(),2));
                queue.add(new UiNode(temp.n.getRight(),3));
            }
            JLabel label2 = new JLabel();
            label2.setText(t);
            label2.setBorder(br);
            label2.setBackground(Color.PINK);
            label2.setOpaque(true);
            label2.setBounds(x+temp.n.level*95,y+(temp.val+temp.n.level)*95,105,30);
            frame.add(label2);
            
        }

    }

    public static List<Integer> genNodeTriple(Node n){
        List<Integer> triples = new ArrayList<>();

        triples.add( (n.v*n.v )- (n.u*n.u)); //V^2-U^2
        triples.add( 2*n.u*n.v);
        triples.add(  n.u*(n.v+n.u)+n.v*(n.v-n.u));  //(U*(v+u))+(V*(V-U))
        return triples;
    }

    public static class UiNode {
    
        public UiNode(Node n, int v){
            this.n = n;
            this.val = v;
        
            
        }
        public Node n;
        public int val;
        
    }
}
