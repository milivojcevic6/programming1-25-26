public class SortedNode extends Node{
    SortedNode(int value) {
        super(value);
    }

    @Override
    public void insert(int value){
        if(next == null || value <= next.value){
            SortedNode newNode = new SortedNode(value);
            newNode.next = this.next;
            this.next = newNode;
            return;
        }

        //recursive step
        next.insert(value);
    }
}
