public class Tree {
    int root;
    Tree left, right;

    boolean insert(int elt){
        if(elt < root){
            //go left
            if(left == null){
                left = new Tree();
                left.root = elt;
                return true;
            }else {
               return left.insert(elt);
            }
        }else if(elt > root){
            //go right
            if(right == null){
                right = new Tree();
                right.root = elt;
                return true;
            }else {
                return right.insert(elt);
            }
        }else{
            return false; // cant insert at root
        }
    }

    boolean contains(int elt){
        if(root == elt){
            return true;
        }else if(elt < root){
            // go left
            if(left == null){
                return false;
            }else{
                return left.contains(elt);
            }
        }else{
            // go right
            if(right == null){
                return false;
            }else{
                return right.contains(elt);
            }
        }
    }

    boolean delete(int elt){
        if(root == elt){
            return false; // we will not delete root
        } else if (elt < root) {
            //go left
            if(left == null){
                return false;
            }else{
                if(left.root == elt){
                    //we delete here but it is too complicated, you can try at home :)
                    return true;
                }
                return left.delete(elt) ;
            }
        }else {
            //go right
            if(right == null){
                return false;
            }else{
                if(right.root == elt){
                    //we delete here but it is too complicated, you can try at home :)
                    return true;
                }
                return right.delete(elt);
            }
        }
    }

    // 2 candidates for replacement: smallest in right subtree or largest in left


    void printInOrder(){
        if(left != null){
            left.printInOrder();
        }

        System.out.print(root + " ");

        if(right != null){
            right.printInOrder();
        }
    }
}
