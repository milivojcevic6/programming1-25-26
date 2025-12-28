public class Node {
    int value;
    Node next;

    public Node(int value){
        this.value = value;
        this.next = null;
    }

    public void insert(int value){
        if(next == null){
            next = new Node(value);
        } // base case (stopping condition)
        else {
            next.insert(value);
        }
    }

    public boolean contains(int value){
        // 2 stopping conditions(base cases)
        //1st base case
        if(this.value == value){
            return true;
        }

        // 2nd base case
        if(next == null){
            return false;
        }

        return next.contains(value);

    }

    public boolean delete(int value){
        //base case
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
            return 1 + next.length();
        }
    }


}
