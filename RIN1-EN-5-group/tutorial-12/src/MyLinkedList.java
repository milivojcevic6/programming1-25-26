public class MyLinkedList {
    Node head;

    // contains
    public boolean contains(int value){
        System.out.print("Contains " + value + ": ");
        if(head == null){ //check if list is empty
            return false;
        }else {
            return head.contains(value);
        }
    }

    //insert
    void insert(int value){
        System.out.println("Inserting " + value);
        if(head == null){
            head = new Node(value);
        }else {
            head.insert(value);
        }
    }

    boolean delete(int value){
        System.out.print("Deleting "  + value + ": ");
        if(head == null){
            return false;
        }else if(head.value == value){
            head = head.next;
            return true;
        }else {
            return head.delete(value);
        }
    }

    //print
    void printList(){
        System.out.print("List: ");
        if(head == null) { //empty list
            System.out.print("null");
        }else {
            head.printNode();
        }
        System.out.println();
    }

    int length(){
        System.out.print("Length: ");
        if(head == null){
            return 0;
        }else{
            return head.length();
        }
    }
}
