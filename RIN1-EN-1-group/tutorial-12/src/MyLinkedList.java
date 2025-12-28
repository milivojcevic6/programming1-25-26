public class MyLinkedList {
    Node head; // first node in the list

    public void insert(int value){
        if(head == null){
            head = new Node(value); // if list is empty add first element
        } else {
            head.insert(value);
        }
    }

    public boolean contains(int value){
        if(head == null){ //empty list
            return false;
        }
        return head.contains(value);
    }

    public boolean delete(int value){
        if(head == null){ // if list is empty
            return false;
        }

        if(head.value == value){
            head = head.next;
            return true;
        } // make second node become new head

        return head.delete(value);
    }



    public void printList(){
        System.out.print("List content: ");
        if(head == null){
            System.out.print("null");
        }else {
            head.printNode();
        }
        System.out.println();
    }

    public int length(){
        if(head == null){ // empty list
            return 0;
        }else {
            return head.length();
        }
    }
}
