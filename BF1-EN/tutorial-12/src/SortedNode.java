public class SortedNode extends Node{
    public SortedNode(int value) {
        super(value);
    }

    @Override
    public void insert(int value){
        if(next == null || value <= next.value){
            SortedNode newNode = new SortedNode(value);
            newNode.next = next;
            this.next = newNode;
        }else {
            next.insert(value);
        }
    }
}
