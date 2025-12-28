public class Node {
    // fields
    int value;
    Node next; // reference/pointer to next node in the list

    public Node(int value){
        this.value = value;
        this.next = null;
    }

    public void insert(int value){
        // base case
        if(next == null){ //check if we came to the last node
            next = new Node(value);
        }else {
            next.insert(value); // recursive step
        }
    }

    public boolean contains(int value){
        // base case: we found element
        if(this.value == value){
            return true;
        }

        // base case 2 : we came to end of the list
        if(next == null){
            return false;
        }

        return next.contains(value);
    }

    public boolean delete(int value){
        // base case : end of the list
        if(next == null){
            return false;
        }

        if(next.value == value){
            next = next.next; // point to next node from current next
            // garbage collector will delete "deleted" node later
            return true;
        }

        return next.delete(value);


    }

    public void printNode(){
        System.out.print(value + " -> ");
        if(next ==  null){
            System.out.print("null");
        }else {
            next.printNode();
        }
    }

    public int length(){
        if(next == null){ // last element
            return 1;
        }else{
            return next.length() + 1;
        }
    }


}
