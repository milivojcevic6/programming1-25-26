public class Node {
    // fields
    int value;
    Node next;

    Node(int value){
        this.value = value;
        next = null;
    }

    // insert
    public void insert(int value){
        if(next == null){
            next = new Node(value);
        }else{
            next.insert(value);
        }
    }

    // contains
    public boolean contains(int value){
        // base case: stopping condition
        if(this.value == value){
            return true;
        }

        // base case 2: reached end
        if(next == null){
            return false;
        }

        return next.contains(value);
    }

    public boolean delete(int value){
        if(next == null){
            return false;
        }

        if(next.value == value){
            this.next = next.next;
            return true;
        }

        return next.delete(value);
    }

    public void printNode(){
        System.out.print(value + " -> ");

        if(next == null){
            System.out.print("null");
        }else{
            next.printNode();
        }
    }

    public int length(){
        if(next == null){
            return 1;
        }else {
            return next.length() + 1;
        }
    }


}
