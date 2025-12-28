public class Main {
    public static void main(String[] args) {
        // Data structures in Java

        // Linked list
        MyLinkedList ll = new MyLinkedList();
        ll.printList();


        ll.insert(1);
        ll.insert(4);
        ll.insert(87);
        ll.printList();
        System.out.println("Length: " + ll.length());

        System.out.println(ll.contains(4));
        System.out.println(ll.contains(22));

        System.out.println(ll.delete(4));
        System.out.println(ll.contains(4));
        ll.printList();
        System.out.println(ll.delete(1));
        ll.printList();
        System.out.println("Length: " + ll.length());

        System.out.println("------------SORTED LINKED LIST---------");

        SortedLinkedList sll = new SortedLinkedList();
        sll.printList();

        sll.insert(4);
        sll.insert(1);
        sll.insert(9);
        sll.insert(7);
        sll.printList();

        sll.insert(5);
        sll.printList();

        System.out.println(sll.contains(5));
        System.out.println(sll.delete(5));
        System.out.println(sll.contains(5));
        sll.printList();

        System.out.println("---------------TREE (BST)------------");
        Tree tree = new Tree();
        tree.root = 10;

        tree.insert(5);
        tree.insert(15);
        tree.insert(12);
        tree.insert(20);
        tree.insert(4);
        tree.insert(2);

        System.out.println("Contians 20: " + tree.search(20));
        System.out.println("Contians 5: " + tree.search(5));
        System.out.println("Contians 99: " + tree.search(99));

        System.out.println("Delete 20: " + tree.delete(20)); // not actually deleting
        System.out.println("Contians 20: " + tree.search(20));

        tree.printInOrder();




    }
}