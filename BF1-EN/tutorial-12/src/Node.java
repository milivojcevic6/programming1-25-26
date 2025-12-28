public class Node {
    // fields
    int value;
    Node next;

    public Node(int value){
        this.value = value;
        this.next = null;
    }

    // insertion - adding elements to the list
    // add them as last element in the list

    public void insert(int value){
        // base case
        if(next == null){
            next = new Node(value);
        }

        // recursive step
        else{
            next.insert(value);
        }
    }

    public boolean contains(int value){
        // base case 1
        if(this.value == value){
            return true;
        }

        // base case 2 : end of the list
        if(next == null){
            return false;
        }

        return next.contains(value);

    }

    public boolean delete(int value){
        // base case 1
        if(next == null){
            return false;
        }

        // base case 2
        if(next.value == value){
            this.next = next.next;
            return true;
        }

        return next.delete(value);
    }

    public int length(){
        if(next == null){
            return 1;
        }else {
            return next.length() + 1;
        }
    }


    public void printNode(){
        System.out.print(value + " -> ");
        if(next == null){
            System.out.print("null");
        }else{
            next.printNode();
        }
    }



}
