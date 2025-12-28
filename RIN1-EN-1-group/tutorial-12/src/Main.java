public class Main {
    public static void main(String[] args) {
        // Linked list
        MyLinkedList ll = new MyLinkedList();
        ll.printList();

        ll.insert(2);
        ll.insert(6);
        ll.insert(7);
        ll.insert(8);
        ll.printList();
        System.out.println("Length: " + ll.length());

        System.out.println("Contains 5? " + ll.contains(5));
        System.out.println("Contains 2? " + ll.contains(2));
        System.out.println("Contains 9? " + ll.contains(9));

        System.out.println("Delete 7: " + ll.delete(7));
        System.out.println("Delete 99: " + ll.delete(99));


        ll.printList();
        System.out.println("Delete 2: " + ll.delete(2));
        ll.printList();

        System.out.println("Length: " + ll.length());

        // SORTED LINKED LIST
        System.out.println("--------SORTED LINKED LIST---------");
        MySortedLinkedList sll = new MySortedLinkedList();
        sll.printList();
        sll.insert(10);
        sll.printList();
        sll.insert(2);
        sll.printList();
        sll.insert(15);
        sll.printList();
        sll.insert(20);
        sll.printList();
        sll.insert(3);
        sll.printList();
        sll.insert(4);
        sll.printList();
        sll.insert(7);
        sll.printList();

//        MySortedLinkedList sll2 = new MySortedLinkedList();
//        System.out.println("Minimum: " +  sll2.min());
        System.out.println("Minimum: " +  sll.min());
        System.out.println("Maximum: " +  sll.max());


    }
}