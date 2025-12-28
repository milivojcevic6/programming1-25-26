public class MyLinkedList {
    Node head; // first element in the list

    public void insert(int value){
        System.out.println("Inserting " + value);
        if(head == null){ // empty list
            head = new Node(value);
        }else {
            head.insert(value);
        }
    }

    public boolean contains(int value){
        System.out.print("Contains " + value + ": ");
        if(head == null){
            return false; // bcs list is empty
        }else{
            return head.contains(value);
        }
    }

    boolean delete(int value){
        System.out.print("Deleting " + value + ": ");
        if(head == null){
            return false;
        }

        if(head.value == value){
            head = head.next; // second node becomes first (head)
            return true;
        }

        return head.delete(value);
    }

    public int length(){
        if(head == null){
            return 0;
        }else {
            return head.length();
        }
    }

    void printList(){
        System.out.print("List content: ");
        if(head == null){
            System.out.print("null");
        }else {
            head.printNode();
        }
        System.out.println();
    }
}
