package utils;

import java.util.function.Supplier;


public class Node {

//    Value of that particular node
    public int v,u;
    public int level;
//    Three nodes representing the three branches of the tree
    public Node left;
    public Node mid;
    public Node right;
// Supplier for lazy printing of node
    private Supplier<String> rSupplier;
    private Supplier<String> pSupplier;
// Functional interfaces for lazy evaluation
    private Supplier<Double> aSupplier;
    private Supplier<Double> bSupplier;

    public void setNode(int v,int u, Node left, Node mid, Node right, int l){
        setVal(v,u);
        setLeft(left);
        setRight(right);
        setMid(mid);
        this.level = l;

    }

//    Getter and setter methods
    public Node getMid() {
        return mid;
    }

    public void setMid(Node mid) {
        this.mid = mid;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }


    public String getVal() {

        return "["+(this.v-this.u)+","+this.u+","+this.v+","+(this.v+this.u)+"], ";
    }

    public String getRational(){
        return "("+(this.v-this.u)+"/"+(this.v+this.u)+", "+this.u+"/"+this.v+")";
    }

    public String getPythagorrean(){
        return "{"+((this.v*this.v)-(this.u*this.u))+","+( 2*this.u*this.v)+","+(  this.u*(this.v+this.u)+this.v*(this.v-this.u))+"}";
    }


    public void setVal(int v, int u) {
        this.v = v;
        this.u = u;
    }

    public void printVal(){
        System.out.print(this.getVal());
    }


    // Functional interfaces for lazy evaluation
    public Node() {
        

        // Initialize lazy printing of rtional and pythagorean
        rSupplier = () -> "("+(this.v - this.u)+"/"+(this.v + this.u)+", "+u +"/"+v+")";
        pSupplier = () -> "{"+((this.v*this.v )- (this.u*this.u))+","+(2*this.u*this.v)+","+(this.u*(this.v+this.u)+this.v*(this.v-this.u))+"}";
    
        // Initialize lazy evaluation for a and b of rational
        aSupplier = () -> (v - u) / (double) (v + u);
        bSupplier = () -> u / (double) v;
    }

    // Getter for lazy-printed rational
    public String getRationalLazy() {
        return rSupplier.get();
    }

    // Getter for lazy-evaluated rational
    public double getRationalALazy() {
        return aSupplier.get();
    }

    // Getter for lazy-evaluated rational
    public double getRationalBALazy() {
        return bSupplier.get();
    }

    // Getter for lazy-printed pythagorean
    public String getPythagoreanLazy() {
        return pSupplier.get();
    }
}
