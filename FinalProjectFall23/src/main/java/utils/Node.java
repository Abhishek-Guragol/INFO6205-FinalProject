package utils;

import java.util.List;

public class Node {

    private List<Integer> val;
    public Node left,mid,right;

    public void Node(List<Integer> val, Node left, Node mid, Node right){

        this.left = left;
        this.right = right;
        this.mid = mid;
        this.val = val;
    }

    public List<Integer> getVal() {
        return val;
    }

    public void setVal(List<Integer> val) {
        this.val = val;
    }
}
