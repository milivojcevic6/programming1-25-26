public class MyLinkedList {
    Node head; // first element of the list

    // insert
    public void insert(int value){
        System.out.print("Inserting " + value + ": ");
        //check if list is empty
        if(head == null){
            head = new Node(value);
        }else{
            head.insert(value);
        }
    }

    // contains
    public boolean contains(int value){
        System.out.print("Contains value " + value + ": ");

        //check if list is empty
        if(head == null){
            return false;
        }

        return head.contains(value);
    }

    //delete
    public boolean delete(int value){
        System.out.print("Deleting " + value + ": ");
        // case 1: empty list
        if(head  == null){
            return false; // empty list
        }
        // case 2: head equals value
        if(head.value == value){
            head = head.next;
            return true;
        }

        return head.delete(value);

    }

    public void printList(){
        System.out.print("List contains: ");
        if(head == null){
            System.out.print("null");
        }else {
            head.printNode();
        }
        System.out.println();
    }

    public int length(){
        System.out.print("Length of the list: ");
        //check if empty
        if(head == null){
            return 0;
        }else {
           return head.length();
        }

    }



}
