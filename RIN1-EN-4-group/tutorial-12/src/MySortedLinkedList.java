public class MySortedLinkedList extends MyLinkedList{
    // head is inherited from parent class - first element in the list
    // also smallest
    SortedNode tail; // last elemetn in the list
    // also largest

    @Override
    public void insert(int value){
        // case 1: empty list
        if(head == null){
            SortedNode newNode = new SortedNode(value);
            head = newNode;
            tail = newNode;
            return;
        }

        // case 2: value <= head
        if(value <= head.value){
            SortedNode newNode = new SortedNode(value);
            newNode.next = head;
            head = newNode;
            return;
        }

        // case 3: value >= tail : put last
        if(value >= tail.value){
            SortedNode newNode = new SortedNode(value);
            tail.next = newNode;
            tail = newNode;
            return;
        }

        // recursive step
        head.insert(value);

    }

    // find max and min in O(1)

    public int min(){
        if(head == null){
            throw new RuntimeException("List is empty");
        } else{
            return head.value;
        }

    }

    public int max(){
        if(tail == null){
            throw new RuntimeException("List is empty");
        } else{
            return tail.value;
        }

    }
}
