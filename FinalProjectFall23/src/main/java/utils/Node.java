package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Node {

//    Value of that particular node
    public int v,u;
    public int level;
    public int pos;
//    Three nodes representing the three branches of the tree
    public Node left;
    public Node mid;
    public Node right;


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
}
