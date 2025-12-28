public class NodeSorted extends Node{
    public NodeSorted(int value) {
        super(value);
    }

    @Override
    public void insert(int value){
        if(next == null || value <= next.value){
            NodeSorted newNode = new NodeSorted(value);
            newNode.next = next;
            next = newNode;
            return;
        }

        next.insert(value);
    }
}
