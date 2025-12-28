public class SortedNode extends Node{
    public SortedNode(int value) {
        super(value);
    }

    @Override
    public void insert(int value){
        if(next == null || next.value >= value){
            SortedNode newNode = new SortedNode(value);
            newNode.next = next;
            next = newNode;
            return;
        }

        // recursive step
        next.insert(value);
    }
}
