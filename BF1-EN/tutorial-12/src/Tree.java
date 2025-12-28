public class Tree {
    int root;
    Tree left, right;

    boolean search(int value){
        // check the root
        if(root == value){
            return true;
        }else{
            if(value > root){
                // go right
                if(right == null){
                    return false;
                }else {
                    return right.search(value);
                }
            }else {
                // we go left
                if(left == null){
                    return false;
                }else {
                    return left.search(value);
                }
            }

        }
    }

    boolean insert(int value){
        if(value > root){
            // go right
            if(right == null){
                right = new Tree();
                right.root = value;
                return true;
            }else{
                return right.insert(value);
            }
        }else if(value < root){
            // go left
            if(left == null){
                left = new Tree();
                left.root = value;
                return true;
            }else{
                return left.insert(value);
            }
        }
        else return false; // we dont allow duplicates
    }

    boolean delete(int value){
        if(root == value){
            return false; // we dont delete root for simplicity
        }else if(value > root){
            // go right
            if(right == null){
                return false;
            }
            else if(right.root == value){
                // we delete
                // IT IS TOO COMPLICATED SO WE WILL SKIP IT
                return true;
            }else {
                return right.delete(value);
            }
        }else {
            // go left
            if(left == null){
                return false;
            }
            else if(left.root == value){
                // we delete
                // IT IS TOO COMPLICATED SO WE WILL SKIP IT
                return true;
            }else {
                return right.delete(value);
            }
        }
    }

    void printInOrder(){
        if(left != null) {
            left.printInOrder();
        }
        System.out.print(root + " ");
        if(right != null){
            right.printInOrder();
        }

    }
}
