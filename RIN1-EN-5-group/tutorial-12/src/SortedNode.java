public class SortedNode extends Node{
    SortedNode(int value) {
        super(value);
    }

    @Override
    void insert(int value){
        // base case
        if(next == null || next.value >= value){
            SortedNode newNode = new SortedNode(value);
            newNode.next = next;
            next = newNode;

        }else {
            next.insert(value);
        }
    }
}
