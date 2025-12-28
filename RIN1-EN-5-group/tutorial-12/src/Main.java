public class Main {
    public static void main(String[] args) {
        // Data structures
        // Linked List

        MyLinkedList ll = new MyLinkedList();

        ll.insert(2);
        ll.insert(6);
        ll.insert(55);
        ll.insert(4);
        ll.insert(22);

        ll.printList();

        System.out.println(ll.contains(22));
        System.out.println(ll.contains(222));

        System.out.println(ll.delete(22));
        System.out.println(ll.delete(22));
        System.out.println(ll.contains(22));
        ll.printList();

        System.out.println(ll.length());

        System.out.println("----------SORTED LINKED LIST-----------");
        SortedLinkedList sll = new SortedLinkedList();
        sll.insert(2);
        sll.insert(6);
        sll.insert(55);
        sll.insert(4);
        sll.insert(22);

        sll.printList();

        System.out.println("Max: " + sll.max() );
        System.out.println("Min: " + sll.min() );

        System.out.println("------------------TREE------------------");

        Tree tree = new Tree();
        tree.root = 10;

        tree.insert(10);
        tree.insert(20);
        tree.insert(2);
        tree.insert(5);
        tree.insert(11);
        tree.insert(12);
        tree.insert(8);
        tree.insert(7);

        tree.printInOrder();
        System.out.println();
        System.out.println("Contains 12: " + tree.contains(12));
        System.out.println("Contains 122: " + tree.contains(122));

        System.out.println("Delete 12: " + tree.delete(12)); // not deleting actually



    }
}