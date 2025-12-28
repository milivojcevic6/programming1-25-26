public class Node {
    //fields
    int value;
    Node next;

    Node(int value){
        this.value = value;
        this.next = null;
    }

    // contains
    public boolean contains(int value){
        // base case 1: element found
        if(this.value == value){
            return true;
        }
        // base case 2: element not found and we reached the end
        if(next == null){
            return false;
        }

        // recursive call to next node
        return next.contains(value);
    }

    //insert
    void insert(int value){
        if(next == null){
            next = new Node(value);
        }else {
            next.insert(value);
        }
    }

    // delete

    boolean delete(int value){
        if(next == null){
            return false;
        }else if(next.value == value){
            next = next.next;
            return true;
        }else {
            return next.delete(value);
        }
    }

    // get length
    int length(){
        if(next == null){
            return 1;
        }else {
            return next.length() + 1;
        }
    }


    // print method
    void printNode(){
        System.out.print(value + " -> ");
        if(next == null){
            System.out.print("null");
        }else{
            next.printNode();
        }
    }

}
