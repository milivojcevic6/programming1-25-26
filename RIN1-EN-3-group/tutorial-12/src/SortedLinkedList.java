public class SortedLinkedList extends MyLinkedList{
    // we have head from my linked list
    SortedNode tail; // last element in the list
    @Override
    public void insert(int value){
        if(head == null){
            SortedNode newNode = new SortedNode(value);
            head = newNode;
            tail = newNode;
            return;
        }

        // check if less than head
        if(value <= head.value){
            SortedNode newNode = new SortedNode(value);
            newNode.next = head;
            head = newNode;
            return;
        }

        // check if greater than tail
        if(value >= tail.value){
            SortedNode newNode = new SortedNode(value);
            tail.next = newNode;
            tail = newNode;
            return;
        }

        head.insert(value);
    }

    // find min and max in O(1)

    public int min(){
        System.out.print("Min element: ");
        if(head == null){
            throw new RuntimeException("Linked list is empty");
        }else{
            return head.value;
        }
    }
    public int max(){
        System.out.print("Max element: ");
        if(tail == null){
            throw new RuntimeException("Linked list is empty");
        }else{
            return tail.value;
        }
    }
}
