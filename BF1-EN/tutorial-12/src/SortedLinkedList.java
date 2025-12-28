public class SortedLinkedList extends MyLinkedList{
// we have head from mylinkedlist
    SortedNode tail; // last element in the list

    @Override
    public void insert(int value){
        System.out.println("Inserting " + value);
        // for faster checkup
        // check if value we want to insert is smaller than
        // head or larger than tail

        if(head == null){
            SortedNode newNode = new SortedNode(value);
            head = newNode;
            tail = newNode;
        }else if(value <= head.value){
            // add as first element
            SortedNode newNode = new SortedNode(value);
            newNode.next = head;
            head = newNode;
        } else if (tail.value <= value) {
            // add as last element
            SortedNode newNode = new SortedNode(value);
            tail.next = newNode;
            tail = newNode;
        }else{
            head.insert(value);
        }
    }
}
