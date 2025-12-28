public class Tree {
    int root;
    Tree left, right;

    boolean contains(int elt){
        if(root == elt){
            return true;
        }else{
            // 2 options > or <
            if(elt < root){
                // go left
                if(left == null){
                    return false;
                }else {
                    return left.contains(elt);
                }
            }else {
                // go right
                if(right == null){
                    return false;
                }else {
                    return right.contains(elt);
                }
            }
        }
    }

    boolean insert(int elt){
        if(elt == root){
            // we cant add at root (without another class to be coordinator)
            return false;
        }
        else if(elt < root){
            // go left
            if(left == null){
                left = new Tree();
                left.root = elt;
                return true;
            }else {
                return left.insert(elt);
            }
        }else {
            // go right
            if(right == null){
                right = new Tree();
                right.root = elt;
                return true;
            }else{
                return right.insert(elt);
            }
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

    public  void printInOrder(){
        if(left != null){
            left.printInOrder();
        }
        System.out.print(root + " ");
        if(right != null){
            right.printInOrder();
        }
    }

}

