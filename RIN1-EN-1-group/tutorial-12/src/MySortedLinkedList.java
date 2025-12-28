public class MySortedLinkedList extends MyLinkedList{
    // head from Node - reference to the first element
    NodeSorted tail; // reference to the last element

    @Override
    public void insert(int value) {
        if(head == null){// empty list
            NodeSorted newNode = new NodeSorted(value);
            head = newNode;
            tail = newNode;
            return;
        }

        if(head.value >= value){ // add at start
            NodeSorted newNode = new NodeSorted(value);
            newNode.next = head;
            head = newNode;
            return;
        }

        if(tail.value <= value){ // add at end
            NodeSorted newNode = new NodeSorted(value);
            tail.next = newNode;
            tail = newNode;
            return;
        }

        head.insert(value);
    }

    //find min and max in O(1) - in 1 step

    public int min(){
        if(head == null){
            throw new RuntimeException("Linked list is empty");
        }else{
            return head.value;
        }
    }
    public int max(){
        if(tail == null){
            throw new RuntimeException("Linked list is empty");
        }else{
            return tail.value;
        }
    }


}
