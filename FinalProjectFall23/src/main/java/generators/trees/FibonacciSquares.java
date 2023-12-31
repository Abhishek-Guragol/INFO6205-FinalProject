package generators.trees;

import java.util.ArrayList;
import java.util.List;

import utils.Node;


public class FibonacciSquares {

//    First 40 squares:
//    [1,1,2,3], [3,1,4,5], [3,2,5,7], [1,2,3,5], [5,1,6,7], [5,4,9,13], [3,4,7,11], [7,2,9,11], [7,5,12,17], [3,5,8,13], [5,2,7,9], [5,3,8,11], [1,3,4,7], [7,1,8,9], [7,6,13,19], [5,6,11,17], [13,4,17,21], [13,9,22,31], [5,9,14,23], [11,4,15,19], [11,7,18,25], [3,7,10,17], [11,2,13,15], [11,9,20,29], [7,9,16,25], [17,5,22,27], [17,12,29,41], [7,12,19,31], [13,5,18,23], [13,8,21,29], [3,8,11,19], [9,2,11,13], [9,7,16,23], [5,7,12,19], [11,3,14,17], [11,8,19,27], [5,8,13,21], [7,3,10,13], [7,4,11,15], [1,4,5,9]

    public String res = "";
    public Node getTreeRoot() {
        return treeRoot;
    }

    public void setTreeRoot(Node treeRoot) {
        this.treeRoot = treeRoot;
    }

    Node treeRoot;


//    Generate the tree
    public Node generateSquares(int n){

        this.treeRoot = genSubtree(2,1,n);

        return getTreeRoot();
    }

    public Node genNode(int v, int u,int l){
        Node n = new Node();
        n.setNode(v,u,null,null,null,l);
        return n;
    }

    public Node genSubtree(int v, int u , int n){

        Node newNode = genNode(v,u,n);
        if(n == 0) {

            newNode.setLeft(null);
            newNode.setMid(null);
            newNode.setRight(null);
        }
        else {
            newNode.setLeft(genSubtree(2*u+v,u,n-1));
            newNode.setMid(genSubtree(2*v+u,v,n-1));
            newNode.setRight(genSubtree(2*v-u,v,n-1));
        }
        return newNode;
    }

    // Printing out the nodes of the tree in order
    public void printTree(Node node){

        if (node == null) return;

        if(node.getLeft() == null) return;
        System.out.print(node.getLeft().getVal()+ node.level);
        System.out.print(node.getMid().getVal()+ node.level);
        System.out.println(node.getRight().getVal()+ node.level);
        printTree(node.getLeft());
        printTree(node.getMid());
        printTree(node.getRight());

    }

    public void getVal(){
        System.out.println(this.treeRoot.getVal());
        printTree(this.treeRoot);
    }

    // Printing out the nodes of the tree in a breadth first search approach 
    public String treeBFS(){
        res = "";
        List<Node> queue = new ArrayList<>();
        queue.add(treeRoot);
        while(!queue.isEmpty()){
            Node temp = queue.remove(0);
            res+=temp.getVal();
            if(temp.getLeft() != null) {
                queue.add(temp.getLeft());
                queue.add(temp.getMid());
                queue.add(temp.getRight());
            }

        }
        return res;
    }
}
