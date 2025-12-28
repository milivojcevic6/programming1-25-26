public class SortedLinkedList extends MyLinkedList{
    // head is inherited from my linked list
    SortedNode tail; // reference to last element

    @Override
    void insert(int value){
        System.out.println("Adding element "+ value);
        if(head == null){
            SortedNode newNode = new SortedNode(value);
            head = newNode;
            tail = newNode;
            return;
        }

        if(value <= head.value){
            SortedNode newNode = new SortedNode(value);
            newNode.next = head;
            head = newNode;
            return;
        }

        if(value >= tail.value){
            SortedNode newNode = new SortedNode(value);
            tail.next = newNode;
            tail = newNode;
            return;
        }

        head.insert(value);

    }

    // find max and min in O(1)

    int min(){
        if(head == null){
            throw new RuntimeException("Empty linked list");
        }else{
            return head.value;
        }
    }

    int max(){
        if(tail == null){
            throw new RuntimeException("Empty linked list");
        }else{
            return tail.value;
        }
    }

}
