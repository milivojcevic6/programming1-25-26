public class Main {
    public static void main(String[] args) {
        // Data structures in Java
        // Linked List
        MyLinkedList ll = new MyLinkedList();
        ll.insert(3);
        ll.insert(5);
        ll.insert(2);
        ll.insert(9);

        System.out.println(ll.contains(2));
        System.out.println(ll.contains(19));

        System.out.println(ll.delete(2));
        System.out.println(ll.delete(2));

        ll.printList();
        System.out.println(ll.delete(5));
        ll.printList();

        System.out.println(ll.length());
        System.out.println(ll.delete(9));
        System.out.println(ll.delete(3));
        System.out.println(ll.length());

        System.out.println("----------SORTED LINKED LIST-------------");

        SortedLinkedList sll = new SortedLinkedList();
        sll.insert(3);
        sll.insert(5);
        sll.insert(2);
        sll.insert(9);
        sll.insert(1);

        sll.printList();
        System.out.println(sll.max());
        System.out.println(sll.min());

        System.out.println("-------------TREES------------");
        Tree bst = new Tree();
        bst.root = 4;
        bst.insert(5);
        bst.insert(1);
        bst.insert(2);
        bst.insert(3);

        System.out.println("Contains 4: " + bst.contains(4));
        System.out.println("Contains 99: " + bst.contains(99));
        System.out.println("Contains 5: " + bst.contains(5));

        bst.printInOrder();


    }
}