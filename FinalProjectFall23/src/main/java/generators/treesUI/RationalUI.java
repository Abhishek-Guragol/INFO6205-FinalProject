package generators.treesUI;


import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;

import generators.trees.FibonacciSquares;
import utils.Node;
public class RationalUI {
    public static void main(String[] args){
        FibonacciSquares fib = new FibonacciSquares();
    
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter number of levels"));
        Node tree = fib.generateSquares(n);
        
        display(tree);
    }


    public static DefaultMutableTreeNode recJtree(Node n){

        DefaultMutableTreeNode t;
        if(n.left == null) return(new DefaultMutableTreeNode(n.getRational()));
        else{
            t = new DefaultMutableTreeNode(n.getRational());
            t.add(recJtree(n.left));
            t.add(recJtree(n.mid));
            t.add(recJtree(n.right));
            return(t);
        }
    }

    public static void display(Node root){

        JFrame frame = new JFrame( 
            "Rational Number Tree");

            DefaultMutableTreeNode uiroot = recJtree(root);
            DefaultTreeModel model = new DefaultTreeModel(uiroot);
            JTree tree = new JTree(model);
            DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer) tree.getCellRenderer();
            Image image = Toolkit.getDefaultToolkit().getImage("/logo.png");
            ImageIcon icon = new ImageIcon(image);
            renderer.setClosedIcon(icon);
            renderer.setOpenIcon(icon);
            renderer.setLeafIcon(icon);
            expandAllNodes(tree, 0, tree.getRowCount());
            frame.add(new JScrollPane(tree));
            frame.setSize(6000, 4000); 
            frame.setDefaultCloseOperation( 
            JFrame.EXIT_ON_CLOSE); 
            frame.setVisible(true); 
        

    }

    private static void expandAllNodes(JTree tree, int startingIndex, int rowCount){
        for(int i=startingIndex;i<rowCount;++i){
            tree.expandRow(i);
        }
    
        if(tree.getRowCount()!=rowCount){
            expandAllNodes(tree, rowCount, tree.getRowCount());
        }
    }
}
