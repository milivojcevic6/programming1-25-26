public class MyLinkedList {
    Node head; // first node in the list

    public void insert(int value){
        if(head == null){ //check if list is empty
            head = new Node(value);
        }else{
            head.insert(value);
        }
    }

    public boolean contains(int value){
        if(head == null){ //check if list is empty
            return false;
        }else{
            return head.contains(value);
        }
    }

    public boolean delete(int value){
        // base case 1 : empty list
        if(head == null){//check if list is empty
            return false;
        }
        // base case 2 : head is deleted
        if(head.value == value){
            head = head.next;
            return true;
        }

        return head.delete(value);


    }

    public void printList(){
        System.out.print("List content: ");
        if(head == null) {
            System.out.print("null");
        }else {
            head.printNode();
        }
        System.out.println();
    }

    public int length(){
        if(head == null){
            return 0;
        }else {
            return head.length();
        }
    }
}
