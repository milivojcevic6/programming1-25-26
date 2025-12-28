import java.lang.foreign.StructLayout;

public class Tree {
    int root;
    Tree left, right;


    public boolean contains(int value){
        if(root == value){
            return true;
        }else{
            if(value < root){
                // go left
                if(left == null){
                    return false;
                }else{
                    // recursive call
                    return left.contains(value);
                }
            }else{
                // go right
                if(right == null){
                    return false;
                }else{
                    return right.contains(value);
                }
            }
        }
    }

    public boolean insert(int value){
        if(value < root){
            // go left
            if(left == null){
                left = new Tree();
                left.root = value;
                return true;
            }
            else{
                return left.insert(value);
            }
        }else if (value > root) {
            // go right
            if(right == null){
                right = new Tree();
                right.root = value;
                return true;
            }
            else{
                return right.insert(value);
            }
        }else{
            // if root of tree equals value
            // we return false and dont allow it
            return false;
        }
    }

    // check this
    boolean delete(int elt) {
        if(elt == root) {
            //something went wrong
            return false;
        }
        if (root > elt) {
            //left
            if(left == null) {
                return false;
            }
            else if(left.root == elt) {
                //DO THE DELETE too complicated
                return false;
            }else {
                return left.delete(elt);
            }
        }
        else {
            //right
            if(right==null) {
                return false;
            }else if(right.root == elt) {
                //DO THE REAL DELETE too complicated
                return false;
            }else {
                return right.delete(elt);
            }
        }
    }

    // method to print elements from smallest to largest
    void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.print(head + " ");

        if (right != null) {
            right.printInOrder();
        }
    }
}
